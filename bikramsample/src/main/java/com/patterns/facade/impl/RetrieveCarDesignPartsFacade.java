/**
 * 
 */
package com.patterns.facade.impl;

import java.util.ArrayList;
import java.util.List;

import com.patterns.facade.IRetrieveCarDesignPartsFacade;
import com.patterns.model.DesignParts;

/**
 * @author bsinh1
 *
 */
public class RetrieveCarDesignPartsFacade implements
		IRetrieveCarDesignPartsFacade {

	/**
	 * 
	 */
	public RetrieveCarDesignPartsFacade() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.patterns.facade.IRetrieveCarDesignPartsFacade#getDesignParts()
	 */
	public List<DesignParts> getDesignParts() {
		// TODO Auto-generated method stub
		List<DesignParts> carDeisgnPartsList = new ArrayList<DesignParts>();
		//Call the external service to get the body design parts
		// Add to the List
		//Similar for Wheel Design parts
		// Facade hides the complexity of backend calls from the client
		return carDeisgnPartsList;
	}

}
