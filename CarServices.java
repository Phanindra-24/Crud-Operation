package com.codegnan.services;

import java.util.List;

import com.codegnan.crud.Car;

import com.codegnan.exception.CarNotFoundException;

public interface CarServices {
	public void addCar(Car car);
	public List<Car>getAllCar();
	public Car getCarById(int id)throws CarNotFoundException;
	public Car updateCar(Car car)throws CarNotFoundException;
	public void deleteCar(int id)throws CarNotFoundException;

}
