package semi.heritage.heritageInfo.vo;

public class heritageList {

	private int sn;					// 순번
	private int no;   				// 고유 키값
	private String ccmaName;		// 문화재종목
	private int crltsnoNm;			// 지정호수
	private String ccbaMnm1;		// 문화재명(국문)
	private String ccbaMnm2;		// 문화재명(한자)
	private String ccbaCtcdNm;		// 시도명
	private String ccsiName;		// 시군구명
	private String ccbaAdmin;		// 관리자
	private String ccbaKdcd;		// 종목코드
	private String ccbaCtcd;		// 시도코드
	private String ccbaAsno;		// 지정번호
	private String ccbaCncl;		// 지정해제여부
	private String ccbaCpno;		// 문화재연계번호
	private String longitude;		// 경도 ( 0일 경우 : 위치 값 없음 )
	private String latitude;		// 위도 ( 0일 경우 : 위치 값 없음 )
	
	public heritageList() {
		super();
	}

	public heritageList(int sn, int no, String ccmaName, int crltsnoNm, String ccbaMnm1, String ccbaMnm2,
			String ccbaCtcdNm, String ccsiName, String ccbaAdmin, String ccbaKdcd, String ccbaCtcd, String ccbaAsno,
			String ccbaCncl, String ccbaCpno, String longitude, String latitude) {
		super();
		this.sn = sn;
		this.no = no;
		this.ccmaName = ccmaName;
		this.crltsnoNm = crltsnoNm;
		this.ccbaMnm1 = ccbaMnm1;
		this.ccbaMnm2 = ccbaMnm2;
		this.ccbaCtcdNm = ccbaCtcdNm;
		this.ccsiName = ccsiName;
		this.ccbaAdmin = ccbaAdmin;
		this.ccbaKdcd = ccbaKdcd;
		this.ccbaCtcd = ccbaCtcd;
		this.ccbaAsno = ccbaAsno;
		this.ccbaCncl = ccbaCncl;
		this.ccbaCpno = ccbaCpno;
		this.longitude = longitude;
		this.latitude = latitude;
	}

	public int getSn() {
		return sn;
	}

	public void setSn(int sn) {
		this.sn = sn;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getCcmaName() {
		return ccmaName;
	}

	public void setCcmaName(String ccmaName) {
		this.ccmaName = ccmaName;
	}

	public int getCrltsnoNm() {
		return crltsnoNm;
	}

	public void setCrltsnoNm(int crltsnoNm) {
		this.crltsnoNm = crltsnoNm;
	}

	public String getCcbaMnm1() {
		return ccbaMnm1;
	}

	public void setCcbaMnm1(String ccbaMnm1) {
		this.ccbaMnm1 = ccbaMnm1;
	}

	public String getCcbaMnm2() {
		return ccbaMnm2;
	}

	public void setCcbaMnm2(String ccbaMnm2) {
		this.ccbaMnm2 = ccbaMnm2;
	}

	public String getCcbaCtcdNm() {
		return ccbaCtcdNm;
	}

	public void setCcbaCtcdNm(String ccbaCtcdNm) {
		this.ccbaCtcdNm = ccbaCtcdNm;
	}

	public String getCcsiName() {
		return ccsiName;
	}

	public void setCcsiName(String ccsiName) {
		this.ccsiName = ccsiName;
	}

	public String getCcbaAdmin() {
		return ccbaAdmin;
	}

	public void setCcbaAdmin(String ccbaAdmin) {
		this.ccbaAdmin = ccbaAdmin;
	}

	public String getCcbaKdcd() {
		return ccbaKdcd;
	}

	public void setCcbaKdcd(String ccbaKdcd) {
		this.ccbaKdcd = ccbaKdcd;
	}

	public String getCcbaCtcd() {
		return ccbaCtcd;
	}

	public void setCcbaCtcd(String ccbaCtcd) {
		this.ccbaCtcd = ccbaCtcd;
	}

	public String getCcbaAsno() {
		return ccbaAsno;
	}

	public void setCcbaAsno(String ccbaAsno) {
		this.ccbaAsno = ccbaAsno;
	}

	public String getCcbaCncl() {
		return ccbaCncl;
	}

	public void setCcbaCncl(String ccbaCncl) {
		this.ccbaCncl = ccbaCncl;
	}

	public String getCcbaCpno() {
		return ccbaCpno;
	}

	public void setCcbaCpno(String ccbaCpno) {
		this.ccbaCpno = ccbaCpno;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	@Override
	public String toString() {
		return "heritageList [sn=" + sn + ", no=" + no + ", ccmaName=" + ccmaName + ", crltsnoNm=" + crltsnoNm
				+ ", ccbaMnm1=" + ccbaMnm1 + ", ccbaMnm2=" + ccbaMnm2 + ", ccbaCtcdNm=" + ccbaCtcdNm + ", ccsiName="
				+ ccsiName + ", ccbaAdmin=" + ccbaAdmin + ", ccbaKdcd=" + ccbaKdcd + ", ccbaCtcd=" + ccbaCtcd
				+ ", ccbaAsno=" + ccbaAsno + ", ccbaCncl=" + ccbaCncl + ", ccbaCpno=" + ccbaCpno + ", longitude="
				+ longitude + ", latitude=" + latitude + "]";
	}
	
	
}
