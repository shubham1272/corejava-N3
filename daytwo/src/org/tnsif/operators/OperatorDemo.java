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
		
		//assignment operator
		x+=y;
		System.out.println(x);
		//logical operator
		boolean res1=(5==5)&&(5>3);
		boolean res2=(5==5)||(5>3);
		boolean res3=!(5==4);
		System.out.println("Result 1 : "+res1);
		System.out.println("Result 1 : "+res2);
		System.out.println("Result 1 : "+res3);
		
		//Bitwise Operator
		int a=12%5;
		int b=12|5;
		int c=2^5;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
	}

}
