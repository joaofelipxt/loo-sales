package model;

import java.util.Iterator;
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
	
	public double getTotalPrice(int qtd) throws IllegalArgumentException {
	    if (qtd < 0) {
	        throw new IllegalArgumentException("Quantidade inválida: " + qtd);
	    }
	    
	    double totalPrice = 0.0;
	    Iterator<Product> iterator = products.iterator();
	    while (iterator.hasNext()) {
	        Product product = iterator.next();
	        totalPrice += product.getPrice() * qtd;
	    }
	    
	    return totalPrice;
	}
	
	public double getTotalPrice(double weight) {
	    double totalPrice = 0.0;
	    Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            totalPrice += product.getPrice() * weight;
        }
	    return totalPrice;
	}
	
	
}	