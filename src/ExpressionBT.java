class ExpressionBT{
	String type;
	char operator;
	int value;
	String variable;
	ExpressionBT left;
	ExpressionBT right;
	
        /*
	 * Constructors 
	 */
	ExpressionBT(){
		
	}
	
	ExpressionBT(String[] e){
		// If the root is an operator, split the array into two sub-tree arrays and pass recursively
		if(e[0].equals("+") || e[0].equals("-") || e[0].equals("*") || e[0].equals("/")) {
			type = "operator";
			operator = e[0].charAt(0);
   
			// will hold the left tree array
			String[] left_arr = new String[(e.length - 1)/2];
			int i = 0;
                        // pull elements by level and put them in the appropriate place in the new array
			for(int level=1; e.length > Math.pow(2, level); level++) {
				for(int j=0; j < Math.pow(2, level)/2; j++) {
					left_arr[i++] = e[(int)Math.pow(2, level) + j - 1];
				}
			}
			left = new ExpressionBT(left_arr);
                        // will hold right tree array
			String[] right_arr = new String[(e.length - 1)/2];
			i = 0;

            		// pull elements by level and put them in the appropriate place in the new array
			for(int level=1; e.length > Math.pow(2, level); level++) {
				for(int j=(int)Math.pow(2, level)/2; j < Math.pow(2, level); j++) {
					right_arr[i++] = e[(int)Math.pow(2, level)+ j - 1];
				}
			}
                   	right = new ExpressionBT(right_arr);
        
        	// if its not an operator, its either a variable or a value
		}else {
	            	// try to parse it as a value, if its not an int it must be a variable
			try {
				value = Integer.parseInt(e[0]);
				type = "val";
			}catch(NumberFormatException exc) {
				variable = e[0];
				type = "var";
			}
		}
	}
    
        /*
	 * Getters 
	 */
	public String getType(){ return type; }
	public int getValue(){ return value; }
	public String getVariable(){ return variable; }
	public ExpressionBT getLeft(){ return left;}
	public ExpressionBT getRight(){ return right; }
	
	/*
	 * Setters  
	 */
	public void setType(String t){ type = t; }
	public void setValue(int v){ value = v; }
	public void setVariable(String var){ variable = var; }
	public void setLeft(ExpressionBT b){ left = b; }
	public void setRight(ExpressionBT b){ right = b; }
	
	/* 
	 * Other Methods 
	 */
	
	// traverses the expression using recursion and returns an integer: 
	//    the integer value of the expression. 
	//  Note: only if there are no variables in the expression. 
	//  If there are variables, print out that you cannot evaluate and return 0
	public int Evaluate(){
		return 0;
	}
	
	// prints out the expression in infix notation with parentheses, using a BTStack
	public void Print(){
		
	}
	
	// It prints out all variables in the tree, if any. 
	// If there is no variable, it prints out "no variable in this expression". This method should use a BTQueue.
	public void allVariables(){
		
	}
	
	// returns true if the expression contains at least one variable, false otherwise
	public boolean includesVariables(){
		return true;
	}
}
