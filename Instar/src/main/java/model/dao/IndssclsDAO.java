package model.dao;

import java.util.List;
import java.util.Properties;

import model.dto.DetailadrDTO;
import model.dto.IndssclsDTO;

public class IndssclsDAO extends StoreDAO {
	public IndssclsDAO() {
		
	}
	public IndssclsDAO(Properties profile){
		super(profile);
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<IndssclsDTO> selectToAll() {
		// TODO Auto-generated method stub
		return super.selectToAll("indsscls.selectToAll", IndssclsDTO.class);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public DetailadrDTO selectById(String id) {
		// TODO Auto-generated method stub
		return super.selectById("detailadr.selectById", DetailadrDTO.class,id);
	}
}
