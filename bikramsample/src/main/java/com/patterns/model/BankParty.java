package com.patterns.model;

import com.patterns.mediator.ILoanMediator;

public class BankParty extends AbstractParty {

private ILoanMediator loanMediator = null;
	
	public BankParty(ILoanMediator loanMediator) {
		// TODO Auto-generated constructor stub
		this.loanMediator = loanMediator;
		loanMediator.registerTargetParty(this);
	}

	@Override
	public void notifyInfo() {
		// TODO Auto-generated method stub
		System.out.println("Mediator Pattern - Process the loan");
	}

	@Override
	public void processLoan() {
		// TODO Auto-generated method stub
		loanMediator.communicateLoanDecision();
	}
}
