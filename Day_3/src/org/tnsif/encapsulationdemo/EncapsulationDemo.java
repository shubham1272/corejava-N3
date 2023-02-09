package org.tnsif.encapsulationdemo;

import java.util.Scanner;

public class EncapsulationDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the PIN");
		ICICI i=new ICICI();
		i.setPin(s.nextInt());
		System.out.println(i.getPin());
		i.accept();

	}

}
