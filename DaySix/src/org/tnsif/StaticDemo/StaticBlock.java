package org.tnsif.StaticDemo;

import java.util.Scanner;

public class StaticBlock {
	//nonStatic
	private int num;
	//Static
	private static String name;
	Scanner s=new Scanner(System.in);
	public void accpet()
	{
		System.out.println("Enter the Salary: ");
		num=s.nextInt();
	}
	public void display()
	{
		System.out.println("The Salary is :"+num);
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		StaticBlock.name = name;
	}
	//Static Block to initialize Static Variable
	static 
	{
		name="Shubham";
	}
}
