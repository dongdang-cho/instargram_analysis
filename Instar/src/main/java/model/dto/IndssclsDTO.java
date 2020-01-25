package model.dto;

public class IndssclsDTO {
	private String bizesId, indsSclsCd, indsSclsNm;
	
	public IndssclsDTO() {
		// TODO Auto-generated constructor stub
	}

	public IndssclsDTO(String bizesId, String indsSclsCd, String indsSclsNm) {
		super();
		this.bizesId = bizesId;
		this.indsSclsCd = indsSclsCd;
		this.indsSclsNm = indsSclsNm;
	}

	public String getBizesId() {
		return bizesId;
	}

	public void setBizesId(String bizesId) {
		this.bizesId = bizesId;
	}

	public String getIndsSclsCd() {
		return indsSclsCd;
	}

	public void setIndsSclsCd(String indsSclsCd) {
		this.indsSclsCd = indsSclsCd;
	}

	public String getIndsSclsNm() {
		return indsSclsNm;
	}

	public void setIndsSclsNm(String indsSclsNm) {
		this.indsSclsNm = indsSclsNm;
	}

	@Override
	public String toString() {
		return "IndssclsDTO [bizesId=" + bizesId + ", indsSclsCd=" + indsSclsCd + ", indsSclsNm=" + indsSclsNm + "]";
	}
	
	
}
