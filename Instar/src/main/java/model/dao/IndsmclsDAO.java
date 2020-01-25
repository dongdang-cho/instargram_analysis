package model.dao;

import java.util.List;
import java.util.Properties;


import model.dto.IndsmclsDTO;

public class IndsmclsDAO extends StoreDAO {
	
	public IndsmclsDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public IndsmclsDAO(Properties profile) {
		super(profile);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<IndsmclsDTO> selectToAll() {
		// TODO Auto-generated method stub
		return super.selectToAll("indsmcls.selectToAll", IndsmclsDTO.class);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public IndsmclsDTO selectById(String id) {
		// TODO Auto-generated method stub
		return super.selectById("indsmcls.selectById", IndsmclsDTO.class,id);
	}
	
}
