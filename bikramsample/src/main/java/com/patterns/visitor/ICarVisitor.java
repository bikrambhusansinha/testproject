/**
 * 
 */
package com.patterns.visitor;

import com.patterns.visitor.impl.RallyDisplay;
import com.patterns.visitor.impl.ShowroomDisplay;

/**
 * @author bsinh1
 *
 */
public interface ICarVisitor {
	
	public void visit(ShowroomDisplay sCustomer);
	public void visit(RallyDisplay rCustomer);
}
