public class PostfixExpression {
	String expression;
	
	/*
	 * Constructors
	 */
	PostfixExpression() {}
	PostfixExpression(String e) { expression = e; }
	
	/*
	 * Getters
	 */
	public String getExpression() { return expression; }
	
	/*
	 * Setters
	 */
	public void setExpression(String newExpr) { expression = newExpr; }
	
	/*
	 * Other Methods
	 */
	
	// traverses the expression using IntStack and returns an integer: 
	//    the integer value of the expression
	public int Evaluate(){
		return 0;
	}
	
	// prints out the expression in postfix notation
	public void Print(){
		
	}

}
