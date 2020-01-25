package model.dto;

public class ZipcdDTO {
	private String bizesId, oldZipcd, newZipcd;
	
	public ZipcdDTO() {
		// TODO Auto-generated constructor stub
	}

	public ZipcdDTO(String bizesId, String oldZipcd, String newZipcd) {
		super();
		this.bizesId = bizesId;
		this.oldZipcd = oldZipcd;
		this.newZipcd = newZipcd;
	}

	public String getBizesId() {
		return bizesId;
	}

	public void setBizesId(String bizesId) {
		this.bizesId = bizesId;
	}

	public String getOldZipcd() {
		return oldZipcd;
	}

	public void setOldZipcd(String oldZipcd) {
		this.oldZipcd = oldZipcd;
	}

	public String getNewZipcd() {
		return newZipcd;
	}

	public void setNewZipcd(String newZipcd) {
		this.newZipcd = newZipcd;
	}

	@Override
	public String toString() {
		return "ZipcdDTO [bizesId=" + bizesId + ", oldZipcd=" + oldZipcd + ", newZipcd=" + newZipcd + "]";
	}
	
	
}
