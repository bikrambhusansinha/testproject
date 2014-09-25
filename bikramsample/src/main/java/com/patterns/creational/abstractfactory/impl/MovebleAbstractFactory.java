/**
 * 
 */
package com.patterns.creational.abstractfactory.impl;

import com.patterns.creational.abstractfactory.IMovebleAbstractFactory;
//import com.patterns.creational.abstractfactory.ICarAbstractFactory;
import com.patterns.model.AbstractCar;
import com.patterns.model.Ship;

/**
 * @author bsinh1
 *
 */
public class MovebleAbstractFactory implements IMovebleAbstractFactory {
	private String typeData = null;
	
	public MovebleAbstractFactory(String typeData) {
		this.typeData = typeData;
	}
	public AbstractCar getCar() {
		// TODO Auto-generated method stub
		AbstractCar carData = null;
		/* Factory pattern */
		if("Sedan".equalsIgnoreCase(typeData) ) {
			System.out.println("Get Sedan Car data");
			carData = new SedanCarFactory().produceCar();
		} else if("Sports".equalsIgnoreCase(typeData) ) {
			carData = new SportsCarFactory().produceCar();
		} else {
			// Do Nothing now
		}
		return carData;
	}

	public Ship getShip() {
		// TODO Auto-generated method stub
		return null;
	}
}
