/**
 * 
 */
package com.patterns.command.impl;

import com.patterns.command.CarOrder;
import com.patterns.model.CarTrade;

/**
 * @author bsinh1
 *
 */
public class RetailCarOrder implements CarOrder {

	/**
	 * 
	 */
	
	private CarTrade carTradeData = null;
	
	public RetailCarOrder(CarTrade carTradeData) {
		// TODO Auto-generated constructor stub
		this.carTradeData = carTradeData;
	}

	/* (non-Javadoc)
	 * @see com.patterns.command.CarOrder#executeOrder()
	 */
	public void executeOrder() {
		// TODO Auto-generated method stub
		carTradeData.sellCar();
	}

}
