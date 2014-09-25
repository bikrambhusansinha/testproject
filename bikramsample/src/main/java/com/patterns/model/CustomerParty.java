package com.patterns.model;

import com.patterns.mediator.ILoanMediator;

public class CustomerParty extends AbstractParty {

	public final ILoanMediator getLoanMediator() {
		return loanMediator;
	}

	public void setLoanMediator(ILoanMediator loanMediator) {
		this.loanMediator = loanMediator;
	}

	private ILoanMediator loanMediator = null;
	
	public CustomerParty(final ILoanMediator loanMediator) {
		// TODO Auto-generated constructor stub
		super();
		this.loanMediator = loanMediator;
		loanMediator.registerSourceParty(this);
	}

	@Override
	public void notifyInfo() {
		// TODO Auto-generated method stub
		System.out.println("Mediator Pattern - Apply for the loan");
	}

	@Override
	public void processLoan() {
		// TODO Auto-generated method stub
		loanMediator.askForLoan();
	}
}
