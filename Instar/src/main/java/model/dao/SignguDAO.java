package model.dao;

import java.util.List;
import java.util.Properties;

import model.dto.DetailadrDTO;
import model.dto.SignguDTO;

public class SignguDAO extends StoreDAO {
	public SignguDAO() {
		
	}
	public SignguDAO(Properties profile){
		super(profile);
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<SignguDTO> selectToAll() {
		// TODO Auto-generated method stub
		return super.selectToAll("signgu.selectToAll", SignguDTO.class);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public SignguDTO selectById(String id) {
		// TODO Auto-generated method stub
		return super.selectById("signgu.selectById", SignguDTO.class,id);
	}
	
}
