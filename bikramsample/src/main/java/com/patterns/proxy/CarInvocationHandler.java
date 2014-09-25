package com.patterns.proxy;
 
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
 
public class CarInvocationHandler implements InvocationHandler {
  public CarInvocationHandler(Object realSubject) {
    this.realSubject = realSubject;
  }
 
  public Object invoke(Object proxy, Method m, Object[] args) {
    Object result = null;
    try {
      result = m.invoke(realSubject, args);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    return result;
  }
 
  private Object realSubject = null;

public Object getRealSubject() {
	return realSubject;
}

public void setRealSubject(Object realSubject) {
	this.realSubject = realSubject;
}
}