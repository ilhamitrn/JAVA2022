package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {
	
	@Override
	public void add(Product product) {
		//sadece ve sadece DB erişim kodları yazılır. SQL ...
		System.out.println("Hibernate ile veritabanına eklendi");
	}
}
