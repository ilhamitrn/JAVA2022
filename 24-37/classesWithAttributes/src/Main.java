
public class Main {

	public static void main(String[] args) {

		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Lenovo Laptop");
		product.setPrice(6799);
		product.setStockAmount(3);
		product.setColor("gri");
		Product product2 = new Product(1, "Laptop", "Asus Laptop", 6700, 2, "pink", null);
		System.out.println(product2.getCode());
		
		System.out.println(product.getName());
		System.out.println(product.getCode());

		ProductManager productManager = new ProductManager();
		productManager.Add(product);

		
		

	}

}
