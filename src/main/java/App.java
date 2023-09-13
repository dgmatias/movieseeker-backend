import java.util.List;

import Dao.CategoryDao;
import Model.Category;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Dao.ConnectionDao.getConnection();
		CategoryDao categoryDao = new CategoryDao();
		
		List<Category> list = categoryDao.list();
		
		list.forEach(result -> System.out.println(result.getName()));
		
		
	}

}
