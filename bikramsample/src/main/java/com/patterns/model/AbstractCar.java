/**
 * 
 */
package com.patterns.model;

import java.util.List;

/**
 * @author bsinh1
 *
 */
public abstract class AbstractCar implements Cloneable {
	/* private attributes */
	//private String engineType = null;
	private int wheelSize = 0;
	private String specificationType = null;
	private int carLength = 0;
	private int carWeight = 0;
	private String engineType = null;
	private String carType = null;
	private String carName = null;
	
	public AbstractCar() {
	}
	
	public int getWheelSize() {
		return wheelSize;
	}
	public void setWheelSize(final int wheelSize) {
		this.wheelSize = wheelSize;
	}
	public String getSpecificationType() {
		return specificationType;
	}
	public void setSpecificationType(final String specificationType) {
		this.specificationType = specificationType;
	}
	public int getCarLength() {
		return carLength;
	}
	public void setCarLength(final int carLength) {
		this.carLength = carLength;
	}
	public int getCarWeight() {
		return carWeight;
	}
	public void setCarWeight(final int carWeight) {
		this.carWeight = carWeight;
	}
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(final String engineType) {
		this.engineType = engineType;
	}
	
	public String getCarType() {
		return carType;
	}
	public void setCarType(final String carType) {
		this.carType = carType;
	}
	
	public AbstractCar getClone() {
		try {
			System.out.println("Prototype Pattern - Calling getClone");
			return (AbstractCar) this.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public abstract void designBody(List<DesignParts> installerList);
	/**
	 * @return the carName
	 */
	public String getCarName() {
		return carName;
	}
	/**
	 * @param carName the carName to set
	 */
	public void setCarName(final String carName) {
		this.carName = carName;
	}
}
