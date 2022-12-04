package _10;

import java.util.ArrayList;

public class Order {
	private int order_id;
	
	private Customer customer;
	private ArrayList<Product> productList;
	private Invoice invoice;
	
	public Order(int order_id, Customer customer, ArrayList<Product> productList,Invoice invoice) {
		super();
		this.order_id = order_id;
		this.customer = customer;
		this.productList = productList;
		this.invoice = invoice;
	}
	
	public Order() {
		
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ArrayList<Product> getProductList() {
		return productList;
	}

	public void setProductList(ArrayList<Product> productList) {
		this.productList = productList;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	

	
}
