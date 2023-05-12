package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Register {
	private ArrayList<Product> products;
	
	public Register() {
		products = new ArrayList<>();
	}
	
	public void productRegister(Product product) {
		products.add(product);	
	}
	
	public List<Product> getProducts() {
        return Collections.unmodifiableList(products);
    }
}
