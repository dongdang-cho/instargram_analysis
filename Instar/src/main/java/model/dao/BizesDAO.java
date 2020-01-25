package model.dao;

import java.util.List;
import java.util.Properties;

import model.dto.BizesDTO;

public class BizesDAO extends StoreDAO{
	public BizesDAO() {
		// TODO Auto-generated constructor stub
	}
	public BizesDAO(Properties cmdProfile) {
		super(cmdProfile);
	}
	@SuppressWarnings("unchecked")
	public List<BizesDTO> selectToAll() {
		return super.selectToAll("bizes.selectToAll", BizesDTO.class);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public BizesDTO selectById(String id) {
		// TODO Auto-generated method stub
		return super.selectById("bizes.selectById", BizesDTO.class,id);
	}
	
}
