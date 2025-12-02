package com.codegnan.services;

import java.util.List;

import com.codegnan.crud.Car;
import com.codegnan.data.CarData;
import com.codegnan.data.CarDataImpl;
import com.codegnan.exception.CarNotFoundException;

public class CarServicesImpl implements CarServices{
	CarData data = new CarDataImpl();
	
	@Override
	public void addCar(Car car) {
		data.save(car);
		
	}

	@Override
	public List<Car> getAllCar() {
		return data.findAll();
	}

	@Override
	public Car getCarById(int id) throws CarNotFoundException {
		return data.findById(id);
	}

	@Override
	public Car updateCar(Car car) throws CarNotFoundException {
		return data.update(car);
	}

	@Override
	public void deleteCar(int id) throws CarNotFoundException {
		data.deleteById(id);
	}
}