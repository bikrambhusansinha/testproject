package com.patterns.creational.singleton;

import com.patterns.creational.builderpattern.CarBuilder;
import com.patterns.model.AbstractCar;

/* 
 * This class will assemble different parts of the car
 * @author Bikram Bhusan Sinha
 */
public final class Workshop {
	private static Workshop instanceData = null;

	private Workshop() {
		//Default Constructor
	}

	public static synchronized Workshop getInstance() {
		if (instanceData == null) {
			instanceData = new Workshop();
		}
		return instanceData;
	}

	public AbstractCar assembleCar(final CarBuilder carBuilder) {
		carBuilder.assembleWheel();
		carBuilder.assembleWindow();
		carBuilder.assembleDoor();
		carBuilder.assembleSeat();
		return carBuilder.getCarData();
	}
}
