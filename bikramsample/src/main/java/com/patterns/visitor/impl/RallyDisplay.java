package com.patterns.visitor.impl;

import com.patterns.visitor.CarDisplay;
import com.patterns.visitor.ICarVisitor;

public class RallyDisplay extends CarDisplay{

	public RallyDisplay(String displayName) {
		this.setDisplayPlaceName(displayName);
	}
	
	@Override
	public void accept(ICarVisitor carVisitor) {
		// TODO Auto-generated method stub
		carVisitor.visit(this);
	}
	
	public void showRallyDetails () {
		// Show the location of the Rally and the type of cars for display
	}

	@Override
	public void displayCarAttributes() {
		// TODO Auto-generated method stub
		
	}
}
