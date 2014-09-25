package com.patterns.visitor.impl;

import com.patterns.visitor.CarDisplay;
import com.patterns.visitor.ICarVisitor;

public class ShowroomDisplay extends CarDisplay {

	public ShowroomDisplay(String displayName) {
		super();
		this.setDisplayPlaceName(displayName);
	}
	
	@Override
	public void accept(ICarVisitor carVisitor) {
		// TODO Auto-generated method stub
		carVisitor.visit(this);
	}

	@Override
	public void displayCarAttributes() {
		// TODO Auto-generated method stub
		
	}
}
