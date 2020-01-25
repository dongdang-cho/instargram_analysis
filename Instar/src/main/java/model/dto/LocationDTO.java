package model.dto;

public class LocationDTO {
	private String bizesId, lon, lat;
	
	public LocationDTO() {
		// TODO Auto-generated constructor stub
	}

	public LocationDTO(String bizesId, String lon, String lat) {
		super();
		this.bizesId = bizesId;
		this.lon = lon;
		this.lat = lat;
	}

	public String getBizesId() {
		return bizesId;
	}

	public void setBizesId(String bizesId) {
		this.bizesId = bizesId;
	}

	public String getLon() {
		return lon;
	}

	public void setLon(String lon) {
		this.lon = lon;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	@Override
	public String toString() {
		return "LocationDTO [bizesId=" + bizesId + ", lon=" + lon + ", lat=" + lat + "]";
	}
	
	
}
