/**
 * 
 */
package com.patterns.template.impl;

import com.patterns.model.AbstractCar;
import com.patterns.template.AbstractCarAccessoriesAssembler;

/**
 * @author bsinh1
 *
 */
public class SedanCarAccessoriesAssembler extends AbstractCarAccessoriesAssembler {

	/**
	 * 
	 */
	public SedanCarAccessoriesAssembler(AbstractCar carData) {
		// TODO Auto-generated constructor stub
		super(carData);
	}

	/* (non-Javadoc)
	 * @see com.patterns.template.ACarAccessoriesAssembler#assembleStereoSystem(com.patterns.model.Car)
	 */
	@Override
	public void assembleStereoSystem() {
		// TODO Auto-generated method stub
		// Implement own method
		System.out.println("Template Method Pattern - Calling assembleStereoSystem");
	}

	/* (non-Javadoc)
	 * @see com.patterns.template.ACarAccessoriesAssembler#assembleGPSSystem(com.patterns.model.Car)
	 */
	@Override
	public void assembleGPSSystem() {
		// TODO Auto-generated method stub
		System.out.println("Template Method Pattern - Calling assembleGPSSystem");
	}

}
