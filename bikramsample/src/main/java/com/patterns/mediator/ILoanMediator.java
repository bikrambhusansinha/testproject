package com.patterns.mediator;

import com.patterns.model.AbstractParty;

/**
 * 
 */

/**
 * @author bsinh1
 *
 */
public interface ILoanMediator {
	void communicateLoanDecision();
	boolean askForLoan();
	void registerSourceParty(AbstractParty sourceParty);
	void registerTargetParty(AbstractParty targetParty);
}
