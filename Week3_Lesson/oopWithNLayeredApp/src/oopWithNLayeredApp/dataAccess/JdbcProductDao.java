package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao  {

	@Override
	public void add(Product product) {
		//sadece ve sadece DB erişim kodları yazılır. SQL ...
		System.out.println("JDBC ile veritabanına eklendi");
	}

}
