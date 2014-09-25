/**
 * 
 */
package com.patterns.creational.abstractfactory;

import com.patterns.model.AbstractCar;
import com.patterns.model.Ship;

/**
 * @author bsinh1
 *
 */
public interface IMovebleAbstractFactory {
	public AbstractCar getCar();
	public Ship getShip();
}
