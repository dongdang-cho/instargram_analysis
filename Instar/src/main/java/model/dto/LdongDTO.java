package model.dto;

public class LdongDTO {
	private String bizesId, ldongCd, ldongNm;
	
	public LdongDTO() {
		// TODO Auto-generated constructor stub
	}

	public LdongDTO(String bizesId, String ldongCd, String ldongNm) {
		super();
		this.bizesId = bizesId;
		this.ldongCd = ldongCd;
		this.ldongNm = ldongNm;
	}

	public String getBizesId() {
		return bizesId;
	}

	public void setBizesId(String bizesId) {
		this.bizesId = bizesId;
	}

	public String getLdongCd() {
		return ldongCd;
	}

	public void setLdongCd(String ldongCd) {
		this.ldongCd = ldongCd;
	}

	public String getLdongNm() {
		return ldongNm;
	}

	public void setLdongNm(String ldongNm) {
		this.ldongNm = ldongNm;
	}

	@Override
	public String toString() {
		return "LdongDTO [bizesId=" + bizesId + ", ldongCd=" + ldongCd + ", ldongNm=" + ldongNm + "]";
	}
	
	
}
