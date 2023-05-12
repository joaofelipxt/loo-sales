package model;

import java.util.List;

public class Sale {
	private Client client;
	private Employee employee;
	private List<Product> products;
	
	public Sale(Client client, Employee employee, List<Product> products) {
		this.client = client;
		this.employee = employee;
		this.products = products;
	}
	
	public double getTotalPrice(int qtd) {
	    double totalPrice = 0.0;
	    for (Product product : products) {
	        totalPrice += product.getPrice() * qtd;
	    }
	    return totalPrice;
	}
	
	public double getTotalPrice(double weight) {
	    double totalPrice = 0.0;
	    for (Product product : products) {
	        totalPrice += product.getPrice() * weight;
	    }
	    return totalPrice;
	}

}	