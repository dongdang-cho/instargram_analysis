package model.dao;

import java.util.List;
import java.util.Properties;

import model.dto.DetailadrDTO;
import model.dto.ZipcdDTO;

public class ZipcdDAO extends StoreDAO {
	public ZipcdDAO() {
		
	}
	public ZipcdDAO(Properties profile){
		super(profile);
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<ZipcdDTO> selectToAll() {
		// TODO Auto-generated method stub
		return super.selectToAll("zipcd.selectToAll", ZipcdDTO.class);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public ZipcdDTO selectById(String id) {
		// TODO Auto-generated method stub
		return super.selectById("zipcd.selectById", ZipcdDTO.class,id);
	}
}
