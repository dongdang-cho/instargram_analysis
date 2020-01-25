package model.dto;

public class CtprvnDTO {
	private String bizesId, ctprvnCd, ctprvnNm;
	public CtprvnDTO() {
		// TODO Auto-generated constructor stub
	}
	public CtprvnDTO(String bizesId, String ctprvnCd, String ctprvnNm) {
		super();
		this.bizesId = bizesId;
		this.ctprvnCd = ctprvnCd;
		this.ctprvnNm = ctprvnNm;
	}
	public String getBizesId() {
		return bizesId;
	}
	public void setBizesId(String bizesId) {
		this.bizesId = bizesId;
	}
	public String getCtprvnCd() {
		return ctprvnCd;
	}
	public void setCtprvnCd(String ctprvnCd) {
		this.ctprvnCd = ctprvnCd;
	}
	public String getCtprvnNm() {
		return ctprvnNm;
	}
	public void setCtprvnNm(String ctprvnNm) {
		this.ctprvnNm = ctprvnNm;
	}
	@Override
	public String toString() {
		return "CtprvnDTO [bizesId=" + bizesId + ", ctprvnCd=" + ctprvnCd + ", ctprvnNm=" + ctprvnNm + "]";
	}
	
}
