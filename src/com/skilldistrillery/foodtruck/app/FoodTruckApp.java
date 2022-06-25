package com.skilldistrillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistrillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {

	private FoodTruck [] FleetOfFoodTruck;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
	}
	
	public void userInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input the name of the food truck:");
		
		System.out.println("Input the type of food of the food truck:");
		
		System.out.println("Input the rating of the food truck:");
	}
	public void createMenu() {
		System.out.println("1. List all existing food trucks.");
		System.out.println("2. See the average rating of food trucks.");
		System.out.println("3. Display the highest-rated food truck.");
		System.out.println("4. Quit the program.");

	}

}
