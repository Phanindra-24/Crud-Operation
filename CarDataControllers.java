package com.codegnan.controllers;

import java.util.List;

import com.codegnan.crud.Car;
import com.codegnan.exception.CarNotFoundException;
import com.codegnan.services.CarServicesImpl;

public class CarDataControllers {
	
	public static void main(String[] args) {
		CarServicesImpl services = new CarServicesImpl();
		//add cars
		
		services.addCar( new Car(1, "Tata", "Zest", 800000));
		services.addCar(new Car(2, "Honda", "Civic", 1200000));
		services.addCar(new Car(3, "Suzuki", "Swift", 1000000));
		services.addCar(new Car(4, "Toyoto", "Innova",  1500000));
		services.addCar(new Car(5, "Mahindra", "Scorpio", 1700000));
		System.out.println("Cars Added Successfully");
		System.out.println("All Cars");
		System.out.println("----------------------------------");
		List<Car>cars = services.getAllCar();
		System.out.println(cars);
		for(Car car : cars) {
			System.out.println(car);
		}
		
		// get car by ID : 1
		System.out.println("Fetching Car with ID : 1");
		try {
			Car fetchCar = services.getCarById(1);
			System.out.println("fetchCar");
		} catch (CarNotFoundException e) {
			e.printStackTrace();
		}
		
		// update car by ID : 2
		System.out.println("Update Car with ID : 2");
		try {
			Car updated = services.updateCar(new Car(2,"Skoda", "Rapid", 1200000));
			System.out.println("Update Car : " + updated);
		} catch (CarNotFoundException e) {
			e.printStackTrace();
		}
		
		// delete car with ID : 4
		try {
			services.deleteCar(4);
			System.out.println("Car Deleted Successfully");
		} catch (CarNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("After all Modification Car List");
		System.out.println("-------------------------------");
		List<Car>Car = services.getAllCar();
		System.out.println(cars);
		for(Car car : cars) {
			System.out.println(car);
		}
	}
}
