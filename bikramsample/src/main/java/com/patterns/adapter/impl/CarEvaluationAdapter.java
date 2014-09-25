/**
 * 
 */
package com.patterns.adapter.impl;

import com.patterns.adapter.ICarEvaluationAdapter;
import com.patterns.model.AbstractCar;
import com.patterns.model.CarEvaluator;
import com.patterns.proxy.CarEvaluatorSericeProxy;

/**
 * @author bsinh1
 *
 */
public class CarEvaluationAdapter implements ICarEvaluationAdapter {
	
	private CarEvaluatorSericeProxy carEvaluatorServiceProxy = new CarEvaluatorSericeProxy();
	
	public CarEvaluationAdapter() {
		//Default Constructor
	}

	/* (non-Javadoc)
	 * @see com.patterns.adaptor.ICarEvaluationEngine#evaluateCar(com.patterns.model.Car)
	 */
	public void evaluateCar(AbstractCar carData) {
		// TODO Auto-generated method stub
		CarEvaluator carEvaluator = converToCarEvaluator(carData);
		// Call Car Evaluator web service with this model
		// The web service understand the model CarEvaluator only
		/* Uses Proxy instance from the web service */
		ICarEvaluatorService carEvaluatorSerice = carEvaluatorServiceProxy.getProxyInstance();
		carEvaluatorSerice.evaluateCar(carEvaluator);
	}
	
	private CarEvaluator converToCarEvaluator(AbstractCar carData) {
		// Convert to the CarEvaluator model
		System.out.println("Inside converToCarEvaluator");
		return new CarEvaluator(carData);
	}

	public void testCar(AbstractCar carData, int testVal) {
		// TODO Auto-generated method stub
		
	}

	public boolean testData(int testInt) {
		// TODO Auto-generated method stub
		return false;
	}
}
