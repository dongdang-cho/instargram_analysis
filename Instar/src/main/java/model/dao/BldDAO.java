package model.dao;

import java.util.List;
import java.util.Properties;

import model.dto.BldDTO;

public class BldDAO extends StoreDAO {
	public BldDAO() {
		// TODO Auto-generated constructor stub
	}
	public BldDAO(Properties proFile) {
		super(proFile);
	}
	@SuppressWarnings("unchecked")
	public List<BldDTO> selectToAll() {
		return super.selectToAll("bld.selectToAll", BldDTO.class);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public BldDTO selectById(String id) {
		// TODO Auto-generated method stub
		return super.selectById("bld.selectById", BldDTO.class,id);
	}
}
