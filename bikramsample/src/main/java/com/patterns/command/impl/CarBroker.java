/**
 * 
 */
package com.patterns.command.impl;
import java.util.List;
import java.util.ArrayList;

import com.patterns.command.CarOrder;

/**
 * @author bsinh1
 *
 */
public class CarBroker {

	List<CarOrder> carOrderList = new ArrayList<CarOrder>();
	/**
	 * 
	 */
	public CarBroker() {
		// TODO Auto-generated constructor stub
	}

	public void takeCarOrder(CarOrder carOrder) {
		carOrderList.add(carOrder);
	}
	
	public void tradeCar() {
		for(CarOrder carOrder : carOrderList) {
			carOrder.executeOrder();
		}
	}
}
