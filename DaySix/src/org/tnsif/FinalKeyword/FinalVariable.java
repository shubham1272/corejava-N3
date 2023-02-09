package org.tnsif.FinalKeyword;

public class FinalVariable {
	final static int x=15;
	static public void print()
	{
		//We cant change the Final Variables valur after initialization 
		System.out.println("The value of x is: "+x);
	}
	public static void main(String args[]){
		FinalVariable.print();
		
	}
}
