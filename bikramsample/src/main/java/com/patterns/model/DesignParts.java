package com.patterns.model;

import java.io.Serializable;

public class DesignParts implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String designSpecType = null;

	public DesignParts() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public DesignParts(final String designSpecType) {
		super();
		// TODO Auto-generated constructor stub
		this.designSpecType = designSpecType;
	}

	public String getDesignSpecType() {
		return designSpecType;
	}

	public void setDesignSpecType(String designSpecType) {
		this.designSpecType = designSpecType;
	}
}
