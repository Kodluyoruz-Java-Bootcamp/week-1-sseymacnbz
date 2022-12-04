package _10;

public class Customer {
	
	private int customer_id;
	private String name;
	private int age;
	
	
	public Customer(int customer_id, String name, int age) {
		this.customer_id = customer_id;
		this.name = name;
		this.age = age;
	}
	
	public Customer() {
		
	}
	
	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
