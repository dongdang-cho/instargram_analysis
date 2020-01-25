package model.dao;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import util.DBConnManager;

public abstract class StoreDAO {
	protected Properties profile;
	public StoreDAO() {
		// TODO Auto-generated constructor stub
	}
	public StoreDAO(Properties profile) {
		super();
		this.profile = profile;
	}
	public abstract <T> List<T> selectToAll();
	//동적 실렉트 100개 제한
	protected <T> List<T> selectToAll (String key, Class<T> c) {
		String query = profile.getProperty(key);
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Constructor<T> cons = null;
		List<T> oList = new ArrayList<T>();
		
		try {
			Field[] fields = c.getDeclaredFields();
			cons = c.getDeclaredConstructor();
			
			con = DBConnManager.getConnection();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			
			int index = 0;
			while(rs.next()) {
				T data = (T) cons.newInstance();
				for(Field f : fields) {
					f.setAccessible(true);
					f.set(data,rs.getString(f.getName()));
				}
				
				oList.add(data);
				if(index++>100) return oList;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBConnManager.dbClose(con, ps, rs);
		}
		return oList;
	}

	public abstract <T> T selectById(String id);
	
	protected <T> T selectById (String key, Class<T> c, String id) {
		String query = profile.getProperty(key);
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Constructor<T> cons = null;
		T data = null;
		
		try {
			Field[] fields = c.getDeclaredFields();
			cons = c.getDeclaredConstructor();
			con = DBConnManager.getConnection();
			ps = con.prepareStatement(query);
			ps.setString(1, id);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				data=(T) cons.newInstance();
				for(Field f : fields) {
					f.setAccessible(true);
					f.set(data,rs.getString(f.getName()));
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBConnManager.dbClose(con, ps, rs);
		}
		return data;
	}
}

