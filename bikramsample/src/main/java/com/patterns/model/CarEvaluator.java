/**
 * 
 */
package com.patterns.model;

/**
 * @author bsinh1
 *
 */
public class CarEvaluator {
	
	private AbstractCar carData = null;
	
	public CarEvaluator(AbstractCar carData) {
		this.setCarData(carData);
	}

	public AbstractCar getCarData() {
		return carData;
	}

	public void setCarData(AbstractCar carData) {
		this.carData = carData;
	}

}
