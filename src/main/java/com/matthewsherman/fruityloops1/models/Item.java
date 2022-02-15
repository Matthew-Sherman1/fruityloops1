package com.matthewsherman.fruityloops1.models;

public class item {
    
    // MEMBER VARIABLES
    private String name;
    private double price;
    
    public item(String string, double d) {
		// TODO Auto-generated constructor stub
	}

	// CONSTRUCTOR
    public void Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

}
