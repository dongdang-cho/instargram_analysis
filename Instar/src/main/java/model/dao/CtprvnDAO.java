package model.dao;

import java.util.List;
import java.util.Properties;

import model.dto.CtprvnDTO;

public class CtprvnDAO extends StoreDAO{
	public CtprvnDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public CtprvnDAO(Properties proFile) {
		super(proFile);
	}
	@SuppressWarnings("unchecked")
	public List<CtprvnDTO> selectToAll() {
		return super.selectToAll("ctprvn.selectToAll", CtprvnDTO.class);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public CtprvnDTO selectById(String id) {
		// TODO Auto-generated method stub
		return super.selectById("ctprvn.selectById", CtprvnDTO.class,id);
	}
	
}
