package org.tnsif.decisionmaking;
import java.util.*;
public class CascedingIfDemo {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the Height of A");
		int a=s.nextInt();
		System.out.println("Enter the Height of B");
		int b=s.nextInt();
		System.out.println("Enter the Height of C");
		int c=s.nextInt();
		
		if(a>b && a>c)
			System.out.println("A is greater");
		else if(b>a && b>c)
			System.out.println("B is greater");
		else
			System.out.println("C is greater");
	}

}
