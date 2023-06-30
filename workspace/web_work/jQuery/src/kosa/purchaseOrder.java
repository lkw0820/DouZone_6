package kosa;

public class purchaseOrder {
	private String date;
	private String pno; //발주번호
	private String aCode;//account(거래처)
	private String aName;
	private String eName;//사원 이름
	private String status;//완료 여부
	public purchaseOrder() {
		super();
	}
	public purchaseOrder(String date, String pno, String aCode, String aName, String eName, String status) {
		super();
		this.date = date;
		this.pno = pno;
		this.aCode = aCode;
		this.aName = aName;
		this.eName = eName;
		this.status = status;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPno() {
		return pno;
	}
	public void setPno(String pno) {
		this.pno = pno;
	}
	public String getaCode() {
		return aCode;
	}
	public void setaCode(String aCode) {
		this.aCode = aCode;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
