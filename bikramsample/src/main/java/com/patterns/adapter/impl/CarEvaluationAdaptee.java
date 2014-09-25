/**
 * 
 */
package com.patterns.adapter.impl;

import com.patterns.adapter.ICarEvaluationAdapter;
import com.patterns.model.AbstractCar;

/**
 * @author bsinh1
 *
 */
public class CarEvaluationAdaptee {

	private ICarEvaluationAdapter carEvaluationAdapter = null;
	/**
	 * 
	 */
	public CarEvaluationAdaptee() {
		// TODO Auto-generated constructor stub
		carEvaluationAdapter = new CarEvaluationAdapter();
	}
	
	public void evaluateCarQuality(AbstractCar carData) {
		carEvaluationAdapter.evaluateCar(carData);
	}

}
