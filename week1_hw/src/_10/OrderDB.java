package _10;

import java.util.ArrayList;

public class OrderDB {
	
	ArrayList<Order> orderDb;
	Order order;
	

	//int order_id, Customer customer, ArrayList<Product> productList,Invoice invoice
	public OrderDB(Order order){
		orderDb = new ArrayList<>();
		this.order = order;
	}
	
	public OrderDB(){
		orderDb = new ArrayList<>();
	}
	
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	
	public void add(Order order) {
		orderDb.add(new Order(order.getOrder_id(), order.getCustomer(), order.getProductList(), order.getInvoice()));
	}
	
	public void getAll() {
		for (Order order : orderDb) {
			System.out.println(order.getCustomer().getName());
			
			for (Product product : order.getProductList()) {
				System.out.print(product.getCategory());
				System.out.println(" "+product.getName());
			}
			
			System.out.println(order.getInvoice().calculateInvoice(order.getProductList()));
		}
	}
	
	public Order getOrderbyCustomer(Customer customer){
		Order order_ = null;
		
		for(Order order : orderDb) {
			if(order.getCustomer().getCustomer_id() == customer.getCustomer_id()) {
				order_ = order;
			}
			
		}
		return order_;
	}
	
	public void getProductsbyCustomerId(Customer customer) {
		ArrayList<Product> products = new ArrayList<>();
		for (Order order : orderDb) {
			if(customer.getCustomer_id() == order.getCustomer().getCustomer_id()) {
				products = order.getProductList();
				
				for(Product prd : products) {
					System.out.println(prd.getCategory());
				}
				System.out.println(customer.getCustomer_id()+" id'li ve "+customer.getName() +" isimli müsterinin aldığı urun sayisi..: "+products.size());
				System.out.println();
			}
		}
		
	}
}

