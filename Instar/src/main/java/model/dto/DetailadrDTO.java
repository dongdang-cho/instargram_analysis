package model.dto;

public class DetailadrDTO {
	private String bizesId, dongNo, flrNo, hoNo;

	public DetailadrDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public DetailadrDTO(String bizesId, String dongNo, String flrNo, String hoNo) {
		super();
		this.bizesId = bizesId;
		this.dongNo = dongNo;
		this.flrNo = flrNo;
		this.hoNo = hoNo;
	}

	
	public String getBizesId() {
		return bizesId;
	}

	public void setBizesId(String bizesId) {
		this.bizesId = bizesId;
	}

	public String getDongNo() {
		return dongNo;
	}

	public void setDongNo(String dongNo) {
		this.dongNo = dongNo;
	}

	public String getFlrNo() {
		return flrNo;
	}

	public void setFlrNo(String flrNo) {
		this.flrNo = flrNo;
	}

	public String getHoNo() {
		return hoNo;
	}

	public void setHoNo(String hoNo) {
		this.hoNo = hoNo;
	}

	@Override
	public String toString() {
		return "Detailadr [bizesId=" + bizesId + ", dongNo=" + dongNo + ", flrNo=" + flrNo + ", hoNo=" + hoNo + "]";
	}
	
	
}
