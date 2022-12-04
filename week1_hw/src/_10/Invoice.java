package _10;

import java.util.ArrayList;

public class Invoice {
	
	private int invoice_id;
	private ArrayList<Product> products;
	
	public Invoice(int invoice_id,ArrayList<Product> products) {
		super();
		this.invoice_id = invoice_id;
		this.products = products;
	}

	public int getInvoice_id() {
		return invoice_id;
	}

	public void setInvoice_id(int invoice_id) {
		this.invoice_id = invoice_id;
	}

	
	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	public int calculateInvoice(ArrayList<Product> products) {
		int amount = 0;
		for(Product product : products) {
			amount += product.getPrice();
		}
		
		return amount;
	}
	
}
