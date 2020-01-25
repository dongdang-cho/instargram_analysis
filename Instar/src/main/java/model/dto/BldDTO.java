package model.dto;

public class BldDTO {
	private String bizesId, bldMnno, bldSlno, bldMngNo, bldNm, rdnmAdr;
	
	public BldDTO() {
		// TODO Auto-generated constructor stub
	}

	public BldDTO(String bizesId, String bldMnno, String bldSlno, String bldMngNo, String bldNm, String rdnmAdr) {
		super();
		this.bizesId = bizesId;
		this.bldMnno = bldMnno;
		this.bldSlno = bldSlno;
		this.bldMngNo = bldMngNo;
		this.bldNm = bldNm;
		this.rdnmAdr = rdnmAdr;
	}

	public String getBizesId() {
		return bizesId;
	}

	public void setBizesId(String bizesId) {
		this.bizesId = bizesId;
	}

	public String getBldMnno() {
		return bldMnno;
	}

	public void setBldMnno(String bldMnno) {
		this.bldMnno = bldMnno;
	}

	public String getBldSlno() {
		return bldSlno;
	}

	public void setBldSlno(String bldSlno) {
		this.bldSlno = bldSlno;
	}

	public String getBldMngNo() {
		return bldMngNo;
	}

	public void setBldMngNo(String bldMngNo) {
		this.bldMngNo = bldMngNo;
	}

	public String getBldNm() {
		return bldNm;
	}

	public void setBldNm(String bldNm) {
		this.bldNm = bldNm;
	}

	public String getRdnmAdr() {
		return rdnmAdr;
	}

	public void setRdnmAdr(String rdnmAdr) {
		this.rdnmAdr = rdnmAdr;
	}

	@Override
	public String toString() {
		return "BldDTO [bizesId=" + bizesId + ", bldMnno=" + bldMnno + ", bldSlno=" + bldSlno + ", bldMngNo=" + bldMngNo
				+ ", bldNm=" + bldNm + ", rdnmAdr=" + rdnmAdr + "]";
	}
	
	
}
