package com.codegnan.data;

import java.util.List;

import com.codegnan.crud.Car;

import com.codegnan.exception.CarNotFoundException;

public interface CarData {
	
	public void save(Car car);// create or save car
	public List<Car> findAll();// show all cars
	public Car findById(int id) throws CarNotFoundException;
	public Car update(Car car) throws CarNotFoundException;
	public void deleteById(int id) throws CarNotFoundException;
	

}