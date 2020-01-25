package model.dto;

public class IndsmclsDTO {
	private String bizesId, indsMclsCd, indsMclsNm;
	
	public IndsmclsDTO() {
		// TODO Auto-generated constructor stub
	}

	public IndsmclsDTO(String bizesId, String indsMclsCd, String indsMclsNm) {
		super();
		this.bizesId = bizesId;
		this.indsMclsCd = indsMclsCd;
		this.indsMclsNm = indsMclsNm;
	}

	public String getBizesId() {
		return bizesId;
	}

	public void setBizesId(String bizesId) {
		this.bizesId = bizesId;
	}

	public String getIndsMclsCd() {
		return indsMclsCd;
	}

	public void setIndsMclsCd(String indsMclsCd) {
		this.indsMclsCd = indsMclsCd;
	}

	public String getIndsMclsNm() {
		return indsMclsNm;
	}

	public void setIndsMclsNm(String indsMclsNm) {
		this.indsMclsNm = indsMclsNm;
	}

	@Override
	public String toString() {
		return "IndsmclsDTO [bizesId=" + bizesId + ", indsMclsCd=" + indsMclsCd + ", indsMclsNm=" + indsMclsNm + "]";
	}
	
}
