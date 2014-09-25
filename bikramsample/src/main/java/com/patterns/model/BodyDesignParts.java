/**
 * 
 */
package com.patterns.model;

/**
 * @author bsinh1
 *
 */
public class BodyDesignParts extends DesignParts {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String bodyDesignSpec = null;
	
	/**
	 * 
	 */
	public BodyDesignParts() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public BodyDesignParts(String designSpecType) {
		// TODO Auto-generated constructor stub
		super(designSpecType);
	}
	
	public String getBodyDesignSpec() {
		return bodyDesignSpec;
	}
	public void setBodyDesignSpec(String bodyDesignSpec) {
		this.bodyDesignSpec = bodyDesignSpec;
	}
}
