package com.patterns.strategy;

import com.patterns.model.AbstractCar;

/* This is the prototype class to create a clone for the Washing Unit
 * @author Bikram Sinha
 */
public interface ICarWashingProcessor {

	public void washCar(AbstractCar carType);
	
}
