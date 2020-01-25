package model.dto;

public class RdnmDTO {
	
	private String bizesId, rdnmCd, rdnm;
	
	public RdnmDTO() {
		// TODO Auto-generated constructor stub
	}

	public RdnmDTO(String bizesId, String rdnmCd, String rdnm) {
		super();
		this.bizesId = bizesId;
		this.rdnmCd = rdnmCd;
		this.rdnm = rdnm;
	}

	public String getBizesId() {
		return bizesId;
	}

	public void setBizesId(String bizesId) {
		this.bizesId = bizesId;
	}

	public String getRdnmCd() {
		return rdnmCd;
	}

	public void setRdnmCd(String rdnmCd) {
		this.rdnmCd = rdnmCd;
	}

	public String getRdnm() {
		return rdnm;
	}

	public void setRdnm(String rdnm) {
		this.rdnm = rdnm;
	}

	@Override
	public String toString() {
		return "RdnmDTO [bizesId=" + bizesId + ", rdnmCd=" + rdnmCd + ", rdnm=" + rdnm + "]";
	}

}
