package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Model.Category;


public class CategoryDao {
	
	public List<Category> list() {
		
		List<Category> list = new ArrayList<Category>();
		
		Category category;
		
		Connection cnx = ConnectionDao.getConnection();
		
		String sql = "Select * from categories";
		
		PreparedStatement ps;
		
		try {
			ps = cnx.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				category = new Category();
				
				category.setId(rs.getInt("id"));
				category.setName(rs.getString("name"));
				category.setImg(rs.getString("img"));
				
				list.add(category);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			return list;
		}
		
	}
	
}
