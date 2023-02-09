package org.tnsif.StaticDemo;

import java.util.Scanner;

public class StaticMethodDemo {
	//Data Members
	private static double salary;
	
	static Scanner s=new Scanner(System.in);
	public static void accept()
	{
		System.out.println("Enter the Salary is : ");
		salary=s.nextDouble();
	}
	public static void display()
	{
		System.out.println("The salary is : "+salary);
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

}
