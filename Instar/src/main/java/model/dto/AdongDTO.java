package model.dto;

public class AdongDTO {
	private String bizesId, adongCd, adongNm;
	
	public AdongDTO() {
		// TODO Auto-generated constructor stub
	}

	public AdongDTO(String bizesId, String adongCd, String adongNm) {
		super();
		this.bizesId = bizesId;
		this.adongCd = adongCd;
		this.adongNm = adongNm;
	}

	public String getBizesId() {
		return bizesId;
	}

	public void setBizesId(String bizesId) {
		this.bizesId = bizesId;
	}

	public String getAdongCd() {
		return adongCd;
	}

	public void setAdongCd(String adongCd) {
		this.adongCd = adongCd;
	}

	public String getAdongNm() {
		return adongNm;
	}

	public void setAdongNm(String adongNm) {
		this.adongNm = adongNm;
	}

	@Override
	public String toString() {
		return "AdongDTO [bizesId=" + bizesId + ", adongCd=" + adongCd + ", adongNm=" + adongNm + "]";
	}
	
}
