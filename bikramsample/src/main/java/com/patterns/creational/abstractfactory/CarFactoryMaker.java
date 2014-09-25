package com.patterns.creational.abstractfactory;

import com.patterns.creational.abstractfactory.impl.SedanCarFactory;
import com.patterns.creational.abstractfactory.impl.SportsCarFactory;
import com.patterns.model.AbstractCar;

/* This is the implementation of Abstract Factory
 * @author Bikram Sinha 
 */

public class CarFactoryMaker {
	public AbstractCar getMyCar(String carType) {
		AbstractCar carData = null;
		if("Sedan".equalsIgnoreCase(carType) ) {
			carData = new SedanCarFactory().produceCar();
		} else if("Sports".equalsIgnoreCase(carType) ) {
			carData = new SportsCarFactory().produceCar();
		} else {
			// Do Nothing now
		}
		return carData;
	}
}
