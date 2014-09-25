package com.patterns.creational.abstractfactory.impl;

import com.patterns.creational.abstractfactory.GeneralCarFactory;
import com.patterns.model.AbstractCar;

public class SedanCarFactory implements GeneralCarFactory {

	public SedanCarFactory() {
		//Default Constructor
	}
	
	public AbstractCar produceCar() {
		// TODO Auto-generated method stub
		System.out.println("Create Sedan Car");
		AbstractCar sedanCar = new SedanCar();
		sedanCar.setCarType("sedan");
		return sedanCar;
	}
}
