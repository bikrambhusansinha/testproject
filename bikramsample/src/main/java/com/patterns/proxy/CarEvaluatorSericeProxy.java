/**
 * 
 */
package com.patterns.proxy;

import java.lang.reflect.Proxy;

import com.patterns.adapter.impl.CarEvaluatorService;
import com.patterns.adapter.impl.ICarEvaluatorService;

/**
 * @author bsinh1
 *
 */
public class CarEvaluatorSericeProxy {
	
	ICarEvaluatorService carEvaluatorSerice = new CarEvaluatorService();
	
	public ICarEvaluatorService getProxyInstance() {
		return (ICarEvaluatorService) Proxy.newProxyInstance(CarEvaluatorService.class.getClassLoader(), CarEvaluatorService.class.getInterfaces(), new 
				CarInvocationHandler(carEvaluatorSerice));
	}

}
