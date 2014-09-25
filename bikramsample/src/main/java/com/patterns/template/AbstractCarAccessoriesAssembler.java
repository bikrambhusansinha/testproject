/**
 * 
 */
package com.patterns.template;

import com.patterns.model.AbstractCar;

/**
 * @author bsinh1
 *
 */
public abstract class AbstractCarAccessoriesAssembler {
	
	public AbstractCarAccessoriesAssembler(AbstractCar carData) {
	}
	public void templateAccessoriesAssembler() {
		assembleStereoSystem();
		assembleGPSSystem();
		applyFinalTouch();
	}

	public abstract void assembleStereoSystem();
	public abstract void assembleGPSSystem();
	
	private void applyFinalTouch() {
		// implement the method
		System.out.println("Template Method Pattern - Calling applyFinalTouch");
	}
}
