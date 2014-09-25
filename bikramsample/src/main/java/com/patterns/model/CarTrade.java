/**
 * 
 */
package com.patterns.model;

/**
 * @author bsinh1
 *
 */
public final class CarTrade {

	/**
	 * 
	 */
	
	private AbstractCar carData = null;
	private int carPrice= 0;
	private int carQuantity = 0;
	
	public CarTrade() {
		// TODO Auto-generated constructor stub
	}
	
	public AbstractCar getCarData() {
		return carData;
	}

	public void setCarData(AbstractCar carData) {
		this.carData = carData;
	}

	public int getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}

	public int getCarQuantity() {
		return carQuantity;
	}

	public void setCarQuantity(int carQuantity) {
		this.carQuantity = carQuantity;
	}
	
	public void leaseCar() {
		System.out.println("Command Pattern - leaseCar");
	}
	
	public void sellCar() {
		System.out.println("Command Pattern - sellCar");
	}
	
}
