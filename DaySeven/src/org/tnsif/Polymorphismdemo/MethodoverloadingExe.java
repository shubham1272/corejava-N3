package org.tnsif.Polymorphismdemo;

import java.util.Scanner;

public class MethodoverloadingExe {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Resolution and Slottype: "+ "of your phone");
		int resolution=sc.nextInt();
		sc.nextLine();
		String slottype=sc.next();
		SmartPhone s=new SmartPhone();
		s.setResolution(resolution);
		s.setSlottype(slottype);
		s.display(resolution);
		s.display(resolution, slottype);
		
		Multiplication m=new Multiplication();
		System.out.println(m.mul(22, 2));
		System.out.println(m.mul(2.5f, 3));

	}

}
