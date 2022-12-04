package _10;

import java.util.ArrayList;

public class CustomerDB {
	
	ArrayList<Customer> customerDb;
	
	public CustomerDB(){
		customerDb = new ArrayList<>();
		customerDb.add(new Customer(1,"seyma",6));
		customerDb.add(new Customer(2,"semanur",7));
		customerDb.add(new Customer(10,"cem",27));
		customerDb.add(new Customer(11,"cem",50));
	}
	
	public void add(Customer customer) {
		customerDb.add(new Customer(customer.getCustomer_id(), customer.getName(), customer.getAge()));
	}
	
	public int numberOfCustomers() {
		return customerDb.size();
	}
	
	public void getAll() {
		for (Customer customer : customerDb) {
			System.out.print(customer.getName());
			System.out.println(customer.getAge());
		}
	}
	
	public ArrayList<Customer> getbyName(String name) {
		ArrayList<Customer> customers = new ArrayList<>();
		for (Customer customer : customerDb) {
			if(customer.getName().equalsIgnoreCase(name)) {
				customers.add(customer);
			}
		}
		
		return customers;
	}
	
	public Customer getbyId(int customer_id, Customer customerToSend) {
		for (Customer customer : customerDb) {
			if(customer.getCustomer_id() == customer_id) {
				customerToSend = customer;
			}
		}
		return customerToSend;
	}
	
}
