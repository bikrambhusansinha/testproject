/**
 * 
 */
package com.patterns.mediator.impl;

import com.patterns.mediator.ILoanMediator;
import com.patterns.model.AbstractParty;

/**
 * @author bsinh1
 *
 */
public class LoanMediator implements ILoanMediator {

	private AbstractParty loanSourceParty = null;
	private AbstractParty loanTargetParty = null;
	
	/**
	 * 
	 */
	public LoanMediator() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.patterns.mediator.ILoanMediator#processLoan()
	 */
	public boolean askForLoan() {
		// TODO Auto-generated method stub
		// Convert the loan request to a loan request and notify the Bank
		loanTargetParty.notifyInfo();
		boolean loanDecision = processLoanRequest();
		return loanDecision;
	}

	private boolean processLoanRequest() {
		// TODO Auto-generated method stub
		return true;
	}

	public void communicateLoanDecision() {
		// TODO Auto-generated method stub
		loanSourceParty.notifyInfo();
	}

	public void registerSourceParty(AbstractParty sourceParty) {
		// TODO Auto-generated method stub
		this.loanSourceParty = sourceParty;
	}

	public void registerTargetParty(AbstractParty targetParty) {
		// TODO Auto-generated method stub
		this.loanTargetParty = targetParty;
	}
}
