package model;

public class Meat implements Product {
	private long id;
	private String name;
	private double weight;
	private boolean isAvailable;
	private double price;
	
	public Meat(String name, long id, double weight) {
		this.name = name;
		this.id = id;
		this.weight = weight;
	}
	
	@Override
	public long getId() {
		return id;
	}

	@Override
	public void setId(long id) {
		this.id = id;
		
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public double getWeight() {
		return weight;
	}

	@Override
	public void setWeight(double weight) {
		this.weight = weight;	
	}

	@Override
	public boolean isAvailable() {
		return isAvailable;
	}

	@Override
	public void setAvailable() {
		this.isAvailable = true;
	}
	
	public void setNotAvailable() {
		this.isAvailable = false;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public void setPrice(double price) {
		this.price = price;
	}

}
