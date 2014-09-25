package com.patterns.creational.abstractfactory.impl;

import com.patterns.creational.abstractfactory.GeneralCarFactory;
import com.patterns.model.AbstractCar;

public class SportsCarFactory implements GeneralCarFactory {

	public SportsCarFactory() {
		//Default Constructor
	}
	
	public AbstractCar produceCar() {
		// TODO Auto-generated method stub
		return new SportsCar();
	}

	
//	public Decorator decorateCar() {
//		// TODO Auto-generated method stub
//		return new SportsDecorator();
//	}

}
