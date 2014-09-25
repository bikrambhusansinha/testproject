package com.patterns.decorator;

import com.patterns.model.AbstractCar;
/**
 * 
 */

/**
 * @author bsinh1
 *
 */
public abstract class ICarDecorator extends AbstractCar {
	
	private AbstractCar carData = null;
	
	public ICarDecorator(AbstractCar carData) {
		this.carData = carData;
	}
}
