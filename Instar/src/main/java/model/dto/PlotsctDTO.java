package model.dto;

public class PlotsctDTO {
	private String bizesId, lnoCd, plotSctCd, plotSctNm;
	
	public PlotsctDTO() {
		// TODO Auto-generated constructor stub
	}

	public PlotsctDTO(String bizesId, String lnoCd, String plotSctCd, String plotSctNm) {
		super();
		this.bizesId = bizesId;
		this.lnoCd = lnoCd;
		this.plotSctCd = plotSctCd;
		this.plotSctNm = plotSctNm;
	}

	public String getBizesId() {
		return bizesId;
	}

	public void setBizesId(String bizesId) {
		this.bizesId = bizesId;
	}

	public String getLnoCd() {
		return lnoCd;
	}

	public void setLnoCd(String lnoCd) {
		this.lnoCd = lnoCd;
	}

	public String getPlotSctCd() {
		return plotSctCd;
	}

	public void setPlotSctCd(String plotSctCd) {
		this.plotSctCd = plotSctCd;
	}

	public String getPlotSctNm() {
		return plotSctNm;
	}

	public void setPlotSctNm(String plotSctNm) {
		this.plotSctNm = plotSctNm;
	}

	@Override
	public String toString() {
		return "PlotsctDTO [bizesId=" + bizesId + ", lnoCd=" + lnoCd + ", plotSctCd=" + plotSctCd + ", plotSctNm="
				+ plotSctNm + "]";
	}
	
	
}
