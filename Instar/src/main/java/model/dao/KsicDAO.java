package model.dao;

import java.util.List;
import java.util.Properties;

import model.dto.KsicDTO;

public class KsicDAO extends StoreDAO {
	public KsicDAO() {
		
	}
	public KsicDAO(Properties profile){
		super(profile);
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<KsicDTO> selectToAll() {
		// TODO Auto-generated method stub
		return super.selectToAll("ksic.selectToAll", KsicDTO.class);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public KsicDTO selectById(String id) {
		// TODO Auto-generated method stub
		return super.selectById("ksic.selectById", KsicDTO.class,id);
	}
}
