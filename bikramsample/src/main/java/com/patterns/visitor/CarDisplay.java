package com.patterns.visitor;

import java.util.ArrayList;
import java.util.List;

import com.patterns.model.AbstractCar;

public abstract class CarDisplay {
	private List<AbstractCar> carList = new ArrayList<AbstractCar>();
	
	private String displayPlaceName = null;
	
	public abstract void accept(ICarVisitor carVisitor);
	public abstract void displayCarAttributes();

	/**
	 * @return the carList
	 */
	public List<AbstractCar> getCarList() {
		return carList;
	}

	/**
	 * @param carList the carList to set
	 */
	public void setCarList(List<AbstractCar> carList) {
		this.carList = carList;
	}
	/**
	 * @return the displayPlaceName
	 */
	public String getDisplayPlaceName() {
		return displayPlaceName;
	}
	/**
	 * @param displayPlaceName the displayPlaceName to set
	 */
	public void setDisplayPlaceName(String displayPlaceName) {
		this.displayPlaceName = displayPlaceName;
	}
}
