package model.dao;

import java.util.List;
import java.util.Properties;
import model.dto.LnoadrDTO;

public class LnoadrDAO extends StoreDAO {
	public LnoadrDAO() {
		
	}
	public LnoadrDAO(Properties profile){
		super(profile);
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<LnoadrDTO> selectToAll() {
		// TODO Auto-generated method stub
		return super.selectToAll("lnoadr.selectToAll", LnoadrDTO.class);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public LnoadrDTO selectById(String id) {
		// TODO Auto-generated method stub
		return super.selectById("lnoadr.selectById", LnoadrDTO.class,id);
	}
	
}
