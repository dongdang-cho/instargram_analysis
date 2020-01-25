package model.dto;

public class KsicDTO {
	private String bizesId, ksicCd, ksicNm;
	
	public KsicDTO() {
		// TODO Auto-generated constructor stub
	}

	public KsicDTO(String bizesId, String ksicCd, String ksicNm) {
		super();
		this.bizesId = bizesId;
		this.ksicCd = ksicCd;
		this.ksicNm = ksicNm;
	}

	public String getBizesId() {
		return bizesId;
	}

	public void setBizesId(String bizesId) {
		this.bizesId = bizesId;
	}

	public String getKsicCd() {
		return ksicCd;
	}

	public void setKsicCd(String ksicCd) {
		this.ksicCd = ksicCd;
	}

	public String getKsicNm() {
		return ksicNm;
	}

	public void setKsicNm(String ksicNm) {
		this.ksicNm = ksicNm;
	}

	@Override
	public String toString() {
		return "KsicDTO [bizesId=" + bizesId + ", ksicCd=" + ksicCd + ", ksicNm=" + ksicNm + "]";
	}
	
	
	
	
}
