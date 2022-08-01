package semi.heritage.community.service;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

import semi.heritage.community.vo.CommunityBoard;
import semi.heritage.common.util.PageInfo;
import semi.heritage.community.dao.CommunityBoardDAO;
import semi.heritage.community.vo.CommunityBoard;
import semi.heritage.community.vo.CommunityReply;

import static semi.heritage.common.jdbc.JDBCTemplate.*;

public class CommunityBoardService {
	
	private CommunityBoardDAO dao = new CommunityBoardDAO();
	
	public int getBoardCount(Map<String, String> searchMap, String type) {  
		Connection conn = getConnection();
		String boardType = "";
		if(type.equals("F")) {
			boardType = "FREE_BOARD";
		}
		if(type.equals("T")) {
			boardType = "TO_BOARD";
		}
		if(type.equals("H")) {
			boardType = "HIS_BOARD";
		}
		int result = dao.getBoardCount(conn, searchMap, boardType);
		close(conn);
		return result;
	}
	

	public List<CommunityBoard> getBoardList(PageInfo pageinfo, Map<String, String> searchMap, String type) {
		Connection conn = getConnection();
		String boardType = "";
		if(type.equals("F")) {
			boardType = "FREE_BOARD";
		}
		if(type.equals("T")) {
			boardType = "TO_BOARD";
		}
		if(type.equals("H")) {
			boardType = "HIS_BOARD";
		}
		
		List<CommunityBoard> list = dao.findAll(conn, pageinfo, searchMap, boardType);
		close(conn);
		return list;
	}
	

	public int save(CommunityBoard board, String type) {
		Connection conn = getConnection();
		String boardType = "";
		
		if(type.equals("F")) {
			boardType = "FREE_BOARD";
		}
		if(type.equals("T")) {
			boardType = "TO_BOARD";
		}
		if(type.equals("H")) {
			boardType = "HIS_BOARD";
		}
		
		int result = 0;
		
		if(board.getNo() != 0 ) {
			result = dao.updateBoard(conn, board, boardType);
		} else {
			result = dao.insertBoard(conn, board, boardType);
		}
		
		if(result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		close(conn);
		return result;
	}
	
	public CommunityBoard findBoardByNo(int no, boolean hasRead, String type) {
		Connection conn = getConnection();
		
		String boardType = "";
		if(type.equals("F")) {
			boardType = "FREE_BOARD";
		}
		if(type.equals("T")) {
			boardType = "TO_BOARD";
		}
		if(type.equals("H")) {
			boardType = "HIS_BOARD";
		}
		
		CommunityBoard board = dao.findBoardByNo(conn, no, boardType);
		
		
		// 조회수 증가 로직
		if(hasRead == true && board != null) {
			int result = dao.updateReadCount(conn, board, boardType);
			if(result > 0) {
				commit(conn);
			} else {
				rollback(conn);
			}
		}
		close(conn);
		return board;
	}
	
	public int delete(int no, String type) {
		Connection conn = getConnection();
		
		String boardType = "";
		if(type.equals("F")) {
			boardType = "FREE_BOARD";
		}
		if(type.equals("T")) {
			boardType = "TO_BOARD";
		}
		if(type.equals("H")) {
			boardType = "HIS_BOARD";
		}
		
		int result = dao.updateStatus(conn, no, "N", boardType);
		
		if(result > 0 ) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		close(conn);
		return result;
	}

	public int saveReply(CommunityBoard board, CommunityReply reply, String type) {
		Connection conn = getConnection();
		String boardType = "";
		String replyType = "";
		
		if(type.equals("F")) {
			boardType = "FREE_BOARD";
			replyType = "FREE_REPLY";
		}
		if(type.equals("T")) {
			boardType = "TO_BOARD";
			replyType = "TO_REPLY";
		}
		if(type.equals("H")) {
			boardType = "HIS_BOARD";
			replyType = "HIS_REPLY";
		}
		
		int result = dao.insertReply(conn, reply, replyType);
		
		if(result > 0 ) {
			int replyResult = dao.replyCount(conn, boardType, replyType, board);
			if(replyResult > 0) {
				commit(conn);
			}
			System.out.println("리플 갯수 오류");
		}else {
			rollback(conn);
		}
		
		close(conn);
		return result;
	}

	public int deleteReply(int replyNo, String type) {
		Connection conn = getConnection();
		
		String boardType = "";
		if(type.equals("F")) {
			boardType = "FREE_REPLY";
		}
		if(type.equals("T")) {
			boardType = "TO_REPLY";
		}
		if(type.equals("H")) {
			boardType = "HIS_REPLY";
		}
		
		int result = dao.deleteReply(conn, replyNo, type);
		
		if(result > 0 ) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		close(conn);
		return result;
	}
	public List<CommunityBoard> findToMain() {
		Connection conn = getConnection();
		List<CommunityBoard> list = dao.findToMain(conn);
		close(conn);
		return list;
	}
	
	public static void main(String[] args) {
		CommunityBoardService s = new CommunityBoardService();
		
		s.findToMain();
	}

}
