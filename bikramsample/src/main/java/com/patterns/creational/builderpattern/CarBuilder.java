/**
 * 
 */
package com.patterns.creational.builderpattern;

import com.patterns.creational.abstractfactory.IMovebleAbstractFactory;
import com.patterns.creational.abstractfactory.impl.MovebleAbstractFactory;
import com.patterns.model.AbstractCar;

/**
 * @author bsinh1
 *
 */
public abstract class CarBuilder {
	protected AbstractCar carData = null;
	protected CarBuilder( String carType) {
		setCarData(carType);
	}
	private void setCarData( String carType) {
		/* Abstract Factory Pattern */
		System.out.println("Set carType");
		IMovebleAbstractFactory iMovebleAbstractFactory = new MovebleAbstractFactory(carType);
		carData = iMovebleAbstractFactory.getCar();
	}
	public AbstractCar getCarData() {
		return carData;
	}
	public abstract void assembleSeat();
	public abstract void assembleWheel();
	public abstract void assembleDoor();
	public abstract void assembleWindow();
}
