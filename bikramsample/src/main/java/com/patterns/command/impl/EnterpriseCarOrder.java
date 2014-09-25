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
public class EnterpriseCarOrder implements CarOrder {

	private CarTrade carTraderData = null;
	/**
	 * 
	 */
	public EnterpriseCarOrder(CarTrade carTraderData) {
		// TODO Auto-generated constructor stub
		this.carTraderData = carTraderData;
	}

	/* (non-Javadoc)
	 * @see com.patterns.command.CarOrder#executeOrder()
	 */
	public void executeOrder() {
		// TODO Auto-generated method stub
		carTraderData.leaseCar();
	}

}
