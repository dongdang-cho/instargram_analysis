package model.dto;

public class SignguDTO {
	private String bizesId, signguCd, signguNm;

	public SignguDTO() {
		// TODO Auto-generated constructor stub
	}
	public SignguDTO(String bizesId, String signguCd, String signguNm) {
		super();
		this.bizesId = bizesId;
		this.signguCd = signguCd;
		this.signguNm = signguNm;
	}
	public String getBizesId() {
		return bizesId;
	}
	public void setBizesId(String bizesId) {
		this.bizesId = bizesId;
	}
	public String getSignguCd() {
		return signguCd;
	}
	public void setSignguCd(String signguCd) {
		this.signguCd = signguCd;
	}
	public String getSignguNm() {
		return signguNm;
	}
	public void setSignguNm(String signguNm) {
		this.signguNm = signguNm;
	}
	@Override
	public String toString() {
		return "SignguDTO [bizesId=" + bizesId + ", signguCd=" + signguCd + ", signguNm=" + signguNm + "]";
	}
	
	
}
