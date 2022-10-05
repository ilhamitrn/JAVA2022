package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.EmailLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {

		Product product = new Product(1, "Samsung Galaxy S7 EDGE", 2850.50);
		
		Logger[] loggers = {new EmailLogger(), new DatabaseLogger()};
		

		ProductManager productManager = 
				new ProductManager(new JdbcProductDao(),loggers);
		productManager.add(product);
	}

}
