package com.patterns.mediator;

import com.patterns.model.AbstractCar;

public interface ITyrePressureCheckerDelegator {
	public void checkTyrePressure(AbstractCar carData);
}
