package model;

public interface Product {
	
	public long getId();
	
	public void setId(long id);
	
	public String getName();
	
	public void setName(String name);
	
	public double getWeight();
	
	public void setWeight(double weight);
	
	public boolean isAvailable();
	
	public void setAvailable();
	
	public void setNotAvailable();
	
	public double getPrice();
	
	public void setPrice(double price);
}
