/**
 * 
 */
package com.patterns.strategy.impl;

import com.patterns.creational.abstractfactory.impl.SedanCar;
import com.patterns.mediator.ITyrePressureCheckerDelegator;
import com.patterns.mediator.impl.TyrePressureCheckerDelegator;
import com.patterns.model.AbstractCar;
import com.patterns.strategy.ICarWashingProcessor;

/**
 * @author bsinh1
 *
 */
public class CarWashingStrategyImpl implements ICarWashingProcessor {
	
	/* This is a delagator or helper class */
	ITyrePressureCheckerDelegator tyrePressureCheckerDelegate = new TyrePressureCheckerDelegator();

	/* (non-Javadoc)
	 * @see com.patterns.strategy.CarWashingProcessor#washCar(com.patterns.common.Car)
	 */
	public void washCar(AbstractCar carData) {
		// TODO Auto-generated method stub
	/* There will be different process for washing the car based on the type */
		if("sedan".equalsIgnoreCase(carData.getCarType())) {
			System.out.println("washCar for Sedan");
		}
		/* After the car wash, delegate to check the pressure of the tyres */
		tyrePressureCheckerDelegate.checkTyrePressure(carData);
	}
	
	public static void main(String[] args) {
		AbstractCar carData = new SedanCar ();
		carData.setCarType("sedan");
	}
}
