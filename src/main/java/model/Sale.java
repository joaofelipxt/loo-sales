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
	
	public void sell(int quantidade) throws EstoqueInsuficienteException {
            // Lógica para venda do produto
            if (quantidade > 0 && quantidade <= getQuantidadeEmEstoque()) {
                // Atualizar estoque e outros processamentos necessários
                // ...
            } else {
                throw new EstoqueInsuficienteException("Estoque insuficiente para a venda");
            }
        }
	
	
	public double getTotalPrice(int qtd) {
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