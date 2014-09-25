/**
 * 
 */
package com.patterns.decorator.impl;

import java.util.List;

import com.patterns.decorator.ICarDecorator;
import com.patterns.model.AbstractCar;
import com.patterns.model.DesignParts;

/**
 * @author bsinh1
 *
 */
public class SedanDecorator extends ICarDecorator {
	
	private static ICarDecorator instanceSedanDecorator = null;
	
	public SedanDecorator(AbstractCar carData) {
		super(carData);
	}
	
//	public static ICarDecorator getInstance() {
//		if ( _instanceSedanDecorator == null ) {
//			_instanceSedanDecorator = new SedanDecorator();
//		}
//		return _instanceSedanDecorator;
//	}

	/* (non-Javadoc)
	 * @see com.patterns.decorator.ICarDecorator#paintCar()
	 */
	private void paintCar() {
		// TODO Auto-generated method stub
		//paint the car without changing the structure of the car
	}

	/* (non-Javadoc)
	 * @see com.patterns.decorator.ICarDecorator#fitStereoSystem()
	 */
	private void fitStereoSystem() {
		// TODO Auto-generated method stub
		System.out.println("Calling fitStereoSystem for Sedar car");
	}

	@Override
	public void designBody(List<DesignParts> installerList) {
		// TODO Auto-generated method stub
		// Add the logic for the design
		// Call the additional methods to decorate the car
		paintCar();
		fitStereoSystem();
	}
}
