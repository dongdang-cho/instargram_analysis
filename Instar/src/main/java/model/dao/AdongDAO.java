package model.dao;

import java.util.List;
import java.util.Properties;

import model.dto.AdongDTO;

public class AdongDAO extends StoreDAO{
	
	public AdongDAO() {
		super();
	}
	public AdongDAO(Properties cmdProfile) {
		super(cmdProfile);
	}
	@SuppressWarnings("unchecked")
	public List<AdongDTO> selectToAll() {
		return super.selectToAll("adong.selectToAll", AdongDTO.class);
	}
	@SuppressWarnings("unchecked")
	@Override
	public AdongDTO selectById(String id) {
		// TODO Auto-generated method stub
		return super.selectById("adong.selectById", AdongDTO.class,id);
	}
	
	
}
