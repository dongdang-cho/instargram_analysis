package model.dto;

public class LnoadrDTO {
	private String bizesId, lnoMnno, lnoSlno, lnoAdr;
	
	public LnoadrDTO() {
		// TODO Auto-generated constructor stub
	}

	public LnoadrDTO(String bizesId, String lnoMnno, String lnoSlno, String lnoAdr) {
		super();
		this.bizesId = bizesId;
		this.lnoMnno = lnoMnno;
		this.lnoSlno = lnoSlno;
		this.lnoAdr = lnoAdr;
	}

	public String getBizesId() {
		return bizesId;
	}

	public void setBizesId(String bizesId) {
		this.bizesId = bizesId;
	}

	public String getLnoMnno() {
		return lnoMnno;
	}

	public void setLnoMnno(String lnoMnno) {
		this.lnoMnno = lnoMnno;
	}

	public String getLnoSlno() {
		return lnoSlno;
	}

	public void setLnoSlno(String lnoSlno) {
		this.lnoSlno = lnoSlno;
	}

	public String getLnoAdr() {
		return lnoAdr;
	}

	public void setLnoAdr(String lnoAdr) {
		this.lnoAdr = lnoAdr;
	}

	@Override
	public String toString() {
		return "LnoadrDTO [bizesId=" + bizesId + ", lnoMnno=" + lnoMnno + ", lnoSlno=" + lnoSlno + ", lnoAdr=" + lnoAdr
				+ "]";
	}
	
}
