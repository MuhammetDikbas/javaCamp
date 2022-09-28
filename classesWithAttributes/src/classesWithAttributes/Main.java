package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product = new Product();
		product.setId(1);
		product.setName("Laptop");
		product.setPrice(123);
		product.setStockAmount(2);
		
			System.out.println(product.getKod());
		ProductManager productManager= new ProductManager();
		productManager.Add(product);
	}


}
