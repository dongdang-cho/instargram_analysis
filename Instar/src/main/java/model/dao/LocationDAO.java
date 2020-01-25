package model.dao;

import java.util.List;
import java.util.Properties;


import model.dto.LocationDTO;

public class LocationDAO extends StoreDAO {
	public LocationDAO() {
		
	}
	public LocationDAO(Properties profile){
		super(profile);
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<LocationDTO> selectToAll() {
		// TODO Auto-generated method stub
		return super.selectToAll("location.selectToAll", LocationDTO.class);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public LocationDTO selectById(String id) {
		// TODO Auto-generated method stub
		return super.selectById("location.selectById", LocationDTO.class,id);
	}
}
