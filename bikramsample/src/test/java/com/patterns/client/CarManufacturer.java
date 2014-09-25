package com.patterns.client;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import com.patterns.adapter.impl.CarEvaluationAdaptee;
import com.patterns.command.impl.CarBroker;
import com.patterns.command.impl.EnterpriseCarOrder;
import com.patterns.command.impl.RetailCarOrder;
import com.patterns.creational.builderpattern.CarBuilder;
import com.patterns.creational.builderpattern.SedanCarBuilder;
import com.patterns.creational.singleton.Workshop;
import com.patterns.decorator.ICarDecorator;
import com.patterns.decorator.impl.SedanDecorator;
import com.patterns.facade.IRetrieveCarDesignPartsFacade;
import com.patterns.facade.impl.RetrieveCarDesignPartsFacade;
import com.patterns.mediator.ILoanMediator;
import com.patterns.mediator.impl.LoanMediator;
import com.patterns.model.AbstractCar;
import com.patterns.model.BankParty;
import com.patterns.model.CarTrade;
import com.patterns.model.CustomerParty;
import com.patterns.model.DesignParts;
import com.patterns.strategy.ICarWashingProcessor;
import com.patterns.strategy.impl.CarWashingStrategyImpl;
import com.patterns.template.impl.SedanCarAccessoriesAssembler;
import com.patterns.visitor.CarDisplay;
import com.patterns.visitor.ICarVisitor;
import com.patterns.visitor.impl.SedanCarVisitor;
import com.patterns.visitor.impl.ShowroomDisplay;


/* 
 * This class will create the car, assemble parts, and then wash the car
 * @author Bikram Sinha
 */
public class CarManufacturer extends TestCase {
	
	public final void testFunctionality( ) {
		/* Create the Sedan Car - Builder Pattern */
		CarBuilder sedanCarBuilder = new SedanCarBuilder();
		/* Just need a single instance of the workshop  - Singleton Pattern */
		Workshop carWorkshop = Workshop.getInstance();
		/* Workshop is the Director in the builder pattern */
		AbstractCar carData = carWorkshop.assembleCar(sedanCarBuilder);
		assertTrue("false","sedan".equalsIgnoreCase(carData.getCarType()));
		/* Get the Decorator - Decorator Pattern */
		ICarDecorator sedanCarDecorator = new SedanDecorator(carData);
		/* Get the design parts - Facade Pattern */
		IRetrieveCarDesignPartsFacade retrieveCarDesignPartsFacade = new RetrieveCarDesignPartsFacade();
		List<DesignParts> designPartsList = retrieveCarDesignPartsFacade.getDesignParts();
		/*Decorate a Sedan Car */
		sedanCarDecorator.designBody(designPartsList);
		/* Assemble accessories - Template Method Pattern */
		SedanCarAccessoriesAssembler sedanCarAccessoriesAssembler = new SedanCarAccessoriesAssembler(carData);
		sedanCarAccessoriesAssembler.templateAccessoriesAssembler();
		/* Wash the car - Strategy Pattern */
		ICarWashingProcessor carWashingProcessor = new CarWashingStrategyImpl();
		carWashingProcessor.washCar(carData);
		/* Adapter Pattern - can use an Adaptee here */
		CarEvaluationAdaptee carEvaluationAdaptee = new CarEvaluationAdaptee();
		carEvaluationAdaptee.evaluateCarQuality(carData);
		/* Create a Prototype for showing in the Car showroom - Prototype Pattern */
		AbstractCar demoCar = carData.getClone();
		/* Trader Car - Command Pattern */
		CarBroker carBroker = new CarBroker();
		CarTrade carTradeDataOne = new CarTrade();
		carTradeDataOne.setCarData(carData);
		RetailCarOrder rCarOrder = new RetailCarOrder(carTradeDataOne);
		carBroker.takeCarOrder(rCarOrder);
		CarTrade carTradeDataTwo = new CarTrade();
		carTradeDataTwo.setCarData(demoCar);
		EnterpriseCarOrder eCarOrder = new EnterpriseCarOrder(carTradeDataTwo);
		carBroker.takeCarOrder(eCarOrder);
		carBroker.tradeCar();
		/* Visit Showroom to see the Car - Visitor Pattern */
		ICarVisitor sedanCarVisitor = new SedanCarVisitor("Bikram Sinha");
		CarDisplay showroomDisplay = new ShowroomDisplay("Lajpat Nagar - Honda Showroom");
		List<AbstractCar> carList = new ArrayList<AbstractCar>();
		carData.setCarType("Sedan");
		carData.setCarName("Honda Civic");
		carList.add(carData);
		showroomDisplay.setCarList(carList);
		showroomDisplay.accept(sedanCarVisitor);
		/* Apply for Car Loan - Mediator Pattern */
		ILoanMediator loanMediator =  new LoanMediator();
		CustomerParty customerParty = new CustomerParty(loanMediator);
		BankParty bankParty = new BankParty(loanMediator);
		customerParty.processLoan();
		bankParty.processLoan();
	}
	
	public static void main(String[] args) {
		CarManufacturer carManufacturer = new CarManufacturer();
		carManufacturer.testFunctionality();
		try {
			Runtime.getRuntime().exec("cmd /c start d:\\Ladbrokes\\test.cmd");
		} catch (Exception ex) {
			ex.printStackTrace();
			// Do nothing now
		}
		
	}

}
