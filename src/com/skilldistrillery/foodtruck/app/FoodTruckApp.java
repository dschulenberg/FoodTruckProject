package com.skilldistrillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistrillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {

	private FoodTruck[] FleetOfFoodTruck = new FoodTruck[5];
	private int count = 0;

	public static void main(String[] args) {

		FoodTruckApp app = new FoodTruckApp();

		app.run();

	}

	private void run() {
		FoodTruck newft = null;
		Scanner scan = new Scanner(System.in);
		boolean start = true;

		while (start && count < 5) {
			System.out.println("Input the name of the food truck or type 'quit' to stop:");
			String name = scan.next();

			if (name.equals("quit")) {
				start = false;
				continue;
			}

			System.out.println("Input the type of food of the food truck:");
			String type = scan.next();

			System.out.println("Input the rating of the food truck:");
			double rating = scan.nextDouble();

			newft = new FoodTruck(name, type, rating);
			addTruck(newft);
			newft.setidNumber();

			if (count == 5) {
				start = false;
			}
		}
		do {
			System.out.println();
			createMenu();
			System.out.println();
			int choice = scan.nextInt();
			switch (choice) {

			case 1:
				listOf();
				break;
			case 2:
				listAverage();
				break;
			case 3:
				listHighest();
				break;
			case 4:
				System.out.println("Thank you for using our app. Goodbye");
				start = true;
				break;
			default:
				System.out.println("Error");
				break;

			}
		} while (!start);

		scan.close();
	}

	private void addTruck(FoodTruck newft) {
		FleetOfFoodTruck[count] = newft;
		count++;
	}

	private void createMenu() {
		System.out.println("1. List all existing food trucks.");
		System.out.println("2. See the average rating of food trucks.");
		System.out.println("3. Display the highest-rated food truck.");
		System.out.println("4. Quit the program.");

	}

	private void listOf() {
		for (FoodTruck list : FleetOfFoodTruck) {
			if (list != null) {
				System.out.println(list.toString());
			}
		}
	}

	private void listAverage() {
		double total = 0.0;
		for (FoodTruck list : FleetOfFoodTruck) {
			if (list != null) {
				total += list.getRating();
			}
		}
		double average = total / count;
		System.out.println("The average rating of all Food Trucks is: " + average);
	}

	private void listHighest() {
		double highest = 0.0;
		for (FoodTruck list : FleetOfFoodTruck) {
			if (list != null) {
				if (highest < list.getRating()) {
					highest = list.getRating();

				}
			}
		}
		for (FoodTruck list : FleetOfFoodTruck) {
			if (list != null) {
				if (highest == list.getRating()) {
					System.out.println("The highest rating Food Truck is: " + list.toString());

				}
			}

		}
	}

}
