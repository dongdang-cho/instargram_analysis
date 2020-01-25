package model.dao;

import java.util.List;
import java.util.Properties;

import model.dto.DetailadrDTO;

public class DetailadrDAO extends StoreDAO{
	public DetailadrDAO() {
		// TODO Auto-generated constructor stub
	}
	public DetailadrDAO(Properties proFile) {
		super(proFile);
	}
	@SuppressWarnings("unchecked")
	public List<DetailadrDTO> selectToAll() {
		return super.selectToAll("detailadr.selectToAll", DetailadrDTO.class);
	}
	@SuppressWarnings("unchecked")
	@Override
	public DetailadrDTO selectById(String id) {
		// TODO Auto-generated method stub
		return super.selectById("detailadr.selectById", DetailadrDTO.class,id);
	}
}
