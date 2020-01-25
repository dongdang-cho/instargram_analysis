package model.dao;

import java.util.List;
import java.util.Properties;


import model.dto.PlotsctDTO;

public class PlotsctDAO extends StoreDAO {
	public PlotsctDAO() {
		
	}
	public PlotsctDAO(Properties profile){
		super(profile);
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<PlotsctDTO> selectToAll() {
		// TODO Auto-generated method stub
		return super.selectToAll("plotsct.selectToAll", PlotsctDTO.class);
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public PlotsctDTO selectById(String id) {
		// TODO Auto-generated method stub
		return super.selectById("plotsct.selectById", PlotsctDTO.class,id);
	}
	
	
}
