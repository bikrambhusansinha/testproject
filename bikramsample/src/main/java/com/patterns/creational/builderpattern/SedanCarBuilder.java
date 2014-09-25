package com.patterns.creational.builderpattern;

import com.patterns.model.AbstractCar;

public class SedanCarBuilder extends CarBuilder {
    
	public SedanCarBuilder() {
		super("sedan");
	}

	@Override
	public void assembleSeat() {
		// TODO Auto-generated method stub
		AbstractCar carData = getCarData();
	}

	@Override
	public void assembleWheel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assembleDoor() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assembleWindow() {
		// TODO Auto-generated method stub
		
	}
}
