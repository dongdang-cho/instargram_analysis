package model.dto;

public class IndslclscDTO {
	private String bizesId, indsLclsCd, indsLclsNm;
	
	public IndslclscDTO() {
		// TODO Auto-generated constructor stub
	}

	public IndslclscDTO(String bizesId, String indsLclsCd, String indsLclsNm) {
		super();
		this.bizesId = bizesId;
		this.indsLclsCd = indsLclsCd;
		this.indsLclsNm = indsLclsNm;
	}

	public String getBizesId() {
		return bizesId;
	}

	public void setBizesId(String bizesId) {
		this.bizesId = bizesId;
	}

	public String getIndsLclsCd() {
		return indsLclsCd;
	}

	public void setIndsLclsCd(String indsLclsCd) {
		this.indsLclsCd = indsLclsCd;
	}

	public String getIndsLclsNm() {
		return indsLclsNm;
	}

	public void setIndsLclsNm(String indsLclsNm) {
		this.indsLclsNm = indsLclsNm;
	}

	@Override
	public String toString() {
		return "IndslclscDTO [bizesId=" + bizesId + ", indsLclsCd=" + indsLclsCd + ", indsLclsNm=" + indsLclsNm + "]";
	}
	
}
