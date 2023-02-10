package org.tnsif.Polymorphismdemo;

import java.util.Scanner;

public class ConstructorOverloadingExe {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Engine Specs: ");
		int ccdisplacement=s.nextInt();
		System.out.println("Enter the Color of Car: ");
		String color=s.next();
		VolkswagenVirtus v=new VolkswagenVirtus();
		VolkswagenVirtus v1=new VolkswagenVirtus(ccdisplacement,color);
				
	}

}
