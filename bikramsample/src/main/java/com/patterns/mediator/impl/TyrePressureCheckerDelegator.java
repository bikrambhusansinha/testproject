/**
 * 
 */
package com.patterns.mediator.impl;

import com.patterns.mediator.ITyrePressureCheckerDelegator;
import com.patterns.model.AbstractCar;

/**
 * @author bsinh1
 *
 */
public class TyrePressureCheckerDelegator implements
		ITyrePressureCheckerDelegator {

	/* (non-Javadoc)
	 * @see com.patterns.delegate.ITyrePressureCheckerDelegate#checkTyrePressure(com.patterns.model.Car)
	 */
	public void checkTyrePressure(AbstractCar carData) {
		// TODO Auto-generated method stub
		System.out.println("Inside checkTyrePressure");
	}
}
