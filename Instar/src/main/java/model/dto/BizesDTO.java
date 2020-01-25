package model.dto;

public class BizesDTO {
	private String bizesId, bizesNm, brchNm;
	public BizesDTO() {
		// TODO Auto-generated constructor stub
	}
	public BizesDTO(String bizesId, String bizesNm, String brchNm) {
		super();
		this.bizesId = bizesId;
		this.bizesNm = bizesNm;
		this.brchNm = brchNm;
	}
	
	
	public String getBizesId() {
		return bizesId;
	}
	public void setBizesId(String bizesId) {
		this.bizesId = bizesId;
	}
	public String getBizesNm() {
		return bizesNm;
	}
	public void setBizesNm(String bizesNm) {
		this.bizesNm = bizesNm;
	}
	public String getBrchNm() {
		return brchNm;
	}
	public void setBrchNm(String brchNm) {
		this.brchNm = brchNm;
	}
	@Override
	public String toString() {
		return "BizesDTO [bizesId=" + bizesId + ", bizesNm=" + bizesNm + ", brchNm=" + brchNm + "]";
	}
	
	
}
