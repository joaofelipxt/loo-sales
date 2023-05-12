package model;

import java.util.Date;

public class Fruit extends Vegetable {
	private String nutriInfo;

	
	public Fruit(String name, long id, double weight) {
		super(name, id, weight);
	}
	@Override
	public Date getExpirationDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getRecommendedStorageTemperature() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getNutritionalInformation() {
		return nutriInfo;
	}
	
	public void setNutritionalInformation(String nutriInfo) {
		this.nutriInfo = nutriInfo;
	}
	
}
