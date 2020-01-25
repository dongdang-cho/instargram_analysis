package model.dao;

import java.util.List;
import java.util.Properties;

import model.dto.LdongDTO;

public class LdongDAO extends StoreDAO {
	public LdongDAO() {
		
	}
	public LdongDAO(Properties profile){
		super(profile);
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<LdongDTO> selectToAll() {
		// TODO Auto-generated method stub
		return super.selectToAll("ldong.selectToAll", LdongDTO.class);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public LdongDTO selectById(String id) {
		// TODO Auto-generated method stub
		return super.selectById("ldong.selectById", LdongDTO.class,id);
	}
}
