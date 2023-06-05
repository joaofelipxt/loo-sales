package model;

import java.util.Date;

public abstract class Vegetable implements Product {
	private long id;
	private String name;
	private double weight;
	private boolean isAvailable;
	private double price;
	private VegetableType type;
	
	public Vegetable(String name, long id, double weight, VegetableType type) {
		this.name = name;
		this.id = id;
		this.weight = weight;
		this.type = type;
	}

	@Override
	public long getId() {
		return id;
	}

	@Override
	public void setId(long id) {
		this.id = id;
		
	}

	public VegetableType getType() {
		return type;
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
	
	public abstract Date getExpirationDate();
	
	public abstract double getRecommendedStorageTemperature();	
	
	public abstract String getNutritionalInformation();
}
