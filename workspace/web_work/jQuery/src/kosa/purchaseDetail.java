package kosa;

public class purchaseDetail {
	private String pno;// 얘는 받아와야한다
	private String productCode;
	private String productName;
	private String unit;//단위
	private String cnt;
	private String price;
	private String supplyValue;//공급가액
	private String vat;//부가세
	private String totalPrice;
	private String note;//비고
	public purchaseDetail() {
		super();
	}
	public purchaseDetail(String pno, String productCode, String productName, String unit, String cnt, String price,
			String supplyValue, String vat, String totalPrice, String note) {
		super();
		this.pno = pno;
		this.productCode = productCode;
		this.productName = productName;
		this.unit = unit;
		this.cnt = cnt;
		this.price = price;
		this.supplyValue = supplyValue;
		this.vat = vat;
		this.totalPrice = totalPrice;
		this.note = note;
	}
	public String getPno() {
		return pno;
	}
	public void setPno(String pno) {
		this.pno = pno;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getCnt() {
		return cnt;
	}
	public void setCnt(String cnt) {
		this.cnt = cnt;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getSupplyValue() {
		return supplyValue;
	}
	public void setSupplyValue(String supplyValue) {
		this.supplyValue = supplyValue;
	}
	public String getVat() {
		return vat;
	}
	public void setVat(String vat) {
		this.vat = vat;
	}
	public String getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
}
