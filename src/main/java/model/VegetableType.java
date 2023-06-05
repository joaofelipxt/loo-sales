package model;

public enum VegetableType {
	HERB("Herb"),
	FRUIT("Fruit"),
	ROOTVEGETABLE("Root vegatable");
	
	private final String description;
    
    VegetableType(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return description;
    }
}
