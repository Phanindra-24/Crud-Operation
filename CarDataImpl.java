package com.codegnan.data;

import java.util.ArrayList;

import java.util.List;

import com.codegnan.crud.Car;

import com.codegnan.exception.CarNotFoundException;

public class CarDataImpl implements CarData {
List<Car> carList = new ArrayList<>();
	@Override
	public void save(Car car) {
		carList.add(car);// to add car object to list
		
	}

	@Override
	public List<Car> findAll() {
		return carList;
	}

	@Override
	public Car findById(int id) throws CarNotFoundException {
		for(Car c : carList) {
			if(c.getId() == id) {
				return c;
			}
		}
		throw new CarNotFoundException("Car with Id : " + id + "Not Found");
	}

	@Override
	public Car update(Car car) throws CarNotFoundException {
		for(int i = 0; i < carList.size(); i++) {
			if(carList.get(i).getId() == car.getId()) {
				carList.set(i, car);
				return car;
			}
		}
		throw new CarNotFoundException("Car with Id : " + car.getId() + "Not Found Cannot Update");
	}

	@Override
	public void deleteById(int id) throws CarNotFoundException {
		boolean found = false;
		for(int i = 0; i < carList.size(); i++) {
			if(carList.get(i).getId() == id) {
				carList.remove(i);
				found = true;
				break;
			}
		}
		if(!found) {
			throw new CarNotFoundException("Car with Id : " + id + "Not Found Cannot Upadate");
		}
	}

}
