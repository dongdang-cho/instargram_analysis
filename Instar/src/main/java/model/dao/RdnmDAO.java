package model.dao;

import java.util.List;
import java.util.Properties;

import model.dto.RdnmDTO;

public class RdnmDAO extends StoreDAO {
	public RdnmDAO() {
		
	}
	public RdnmDAO(Properties profile){
		super(profile);
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<RdnmDTO> selectToAll() {
		// TODO Auto-generated method stub
		return super.selectToAll("rdnm.selectToAll", RdnmDTO.class);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public RdnmDTO selectById(String id) {
		// TODO Auto-generated method stub
		return super.selectById("rdnm.selectById", RdnmDTO.class,id);
	}
	
}
