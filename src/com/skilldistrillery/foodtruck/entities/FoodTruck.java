package com.skilldistrillery.foodtruck.entities;

public class FoodTruck {
	private static int idNumber = 1;
	private String name;
	private String type;
	private int iD;
	private double rating;

	/*
	 * You will define a FoodTruck class with fields for a unique numeric id, a name
	 * ("TacoRific", "Mediterranean Medic", etc.), food type ("Tacos", "Falafel",
	 * etc.), and a numeric rating. Potentially use getters and setters
	 * 
	 */

	public FoodTruck() {

	}

	public FoodTruck(String name, String type, double rating) {

		this(idNumber, name, type, rating);
	}

	public FoodTruck(int iD, String name, String type, double rating) {
		this.iD = iD;
		this.name = name;
		this.type = type;
		this.rating = rating;
	}

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}

	public void setidNumber() {
		idNumber++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String toString() {
		StringBuilder listTruck = new StringBuilder();
		listTruck.append("Food Truck iD Number: ").append(iD).append("  Food Truck Name: ").append(name)
				.append("  Type of Food: ").append(type).append("  Rating of FoodTruck: ").append(rating);

		return listTruck.toString();
	}

}
