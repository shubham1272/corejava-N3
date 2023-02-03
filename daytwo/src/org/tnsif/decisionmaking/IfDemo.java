package org.tnsif.decisionmaking;

import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int w1=s.nextInt();
		int w2=s.nextInt();
		if(w1>w2)
			System.out.println("The w1's weight is greater");
		else
			System.out.println("The w2's weight is greater");
			}
		

}
