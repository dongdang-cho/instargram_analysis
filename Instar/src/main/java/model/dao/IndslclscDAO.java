package model.dao;

import java.util.List;
import java.util.Properties;
import model.dto.IndslclscDTO;


public class IndslclscDAO extends StoreDAO {
	public IndslclscDAO() {
		// TODO Auto-generated constructor stub
	}
	public IndslclscDAO(Properties proFile) {
		super(proFile);
	}
	@SuppressWarnings("unchecked")
	public List<IndslclscDTO> selectToAll() {
		return super.selectToAll("indslclsc.selectToAll", IndslclscDTO.class);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public IndslclscDTO selectById(String id) {
		// TODO Auto-generated method stub
		return super.selectById("indslclsc.selectById", IndslclscDTO.class,id);
	}
}
