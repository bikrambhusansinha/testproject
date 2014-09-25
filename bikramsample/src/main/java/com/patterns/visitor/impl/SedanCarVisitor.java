/**
 * 
 */
package com.patterns.visitor.impl;

import java.util.List;

import com.patterns.model.AbstractCar;
import com.patterns.visitor.ICarVisitor;

/**
 * @author bsinh1
 *
 */
public class SedanCarVisitor implements ICarVisitor {

	private String visitorName = null;
	/**
	 * 
	 */
	public SedanCarVisitor() {
		// TODO Auto-generated constructor stub
	}
	
	public SedanCarVisitor(String visitorName) {
		// TODO Auto-generated constructor stub
		this.visitorName = visitorName;
	}

	public void visit(ShowroomDisplay showroomDisplay) {
		// TODO Auto-generated method stub
		System.out.println("Customer : " + visitorName + " visits the showroom + " + 
				showroomDisplay.getDisplayPlaceName());
		List<AbstractCar> showroomCar = showroomDisplay.getCarList();
		if(!showroomCar.isEmpty()) {
			takeTestDrive(showroomCar.get(0),visitorName);
		}
	}

	public void visit(RallyDisplay rallyDisplay) {
		// TODO Auto-generated method stub
	}
	
	private void takeTestDrive(AbstractCar carData, String visitorName) {
		// Implement the logic here
		System.out.println("Taking a test drive for " + carData.getCarName() + " car");
	}

	/**
	 * @return the visitorName
	 */
	public String getVisitorName() {
		return visitorName;
	}

	/**
	 * @param visitorName the visitorName to set
	 */
	public void setVisitorName(String visitorName) {
		this.visitorName = visitorName;
	}

}
