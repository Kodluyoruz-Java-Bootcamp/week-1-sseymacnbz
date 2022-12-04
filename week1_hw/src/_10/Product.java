package _10;

public class Product {
	
	private int product_id;
	private String category;
	private int price;
	private String name;
	private int stock;
	
	
	public Product(int product_id, String category, int price, String name, int stock) {
		super();
		this.product_id = product_id;
		this.category = category;
		this.price = price;
		this.name = name;
		this.stock = stock;
	}
	
	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	
}
