package org.tnsif.operators;

import java.util.Scanner;

public class OperatorDemo {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("The value of X and Y are:");
		int x=s.nextInt();
		int y=s.nextInt();
		System.out.println("The addition is :"+(x+y));
		System.out.println("The Subtraction is :"+(x-y));
		System.out.println("The Multiplication is :"+(x*y));
		System.out.println("The Mod is :"+(x/y));
		System.out.println("The division is :"+(x%y));
		
		//relational
		boolean res=x>y;
		
		
		
	}

}
