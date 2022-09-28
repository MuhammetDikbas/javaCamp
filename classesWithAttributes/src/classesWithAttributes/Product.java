package classesWithAttributes;

public class Product {
	public  Product() {System.out.println("blok çalıstı");}
	int id= 123;
	String name="Laptop";
	String description="";
	double price=123;
	int stockAmount=2;
	String kod;
	public String getKod() {
		return this.name.substring(0, 1)+ id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	
}
