/**
 * 
 */
package com.patterns.adapter;

import com.patterns.model.AbstractCar;

/**
 * @author bsinh1
 *
 */
public interface ICarEvaluationAdapter {
	
	public void evaluateCar(AbstractCar carData);
	public void testCar(AbstractCar carData, int testVal);
}
