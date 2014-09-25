/**
 * 
 */
package com.patterns.model;

/**
 * @author bsinh1
 *
 */
public abstract class AbstractParty {

	private String partyType = null;
	
	private String partyName = null;
	
	private int loanAmount = 0;
	private String loanType = null;
	
	/**
	 * 
	 */
	public AbstractParty() {
		// TODO Auto-generated constructor stub
	}

	public String getPartyType() {
		return partyType;
	}
	public void setPartyType(String partyType) {
		this.partyType = partyType;
	}

	/**
	 * @return the partyName
	 */
	public String getPartyName() {
		return partyName;
	}

	/**
	 * @param partyName the partyName to set
	 */
	public void setPartyName(final String partyName) {
		this.partyName = partyName;
	}

	/**
	 * @return the loanAmount
	 */
	public int getLoanAmount() {
		return loanAmount;
	}

	/**
	 * @param loanAmount the loanAmount to set
	 */
	public void setLoanAmount(final int loanAmount) {
		this.loanAmount = loanAmount;
	}

	/**
	 * @return the loanType
	 */
	public String getLoanType() {
		return loanType;
	}

	/**
	 * @param loanType the loanType to set
	 */
	public void setLoanType(final String loanType) {
		this.loanType = loanType;
	}
	
	public abstract void processLoan();
	public abstract void notifyInfo();
}
