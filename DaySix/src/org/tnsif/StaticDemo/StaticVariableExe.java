package org.tnsif.StaticDemo;

public class StaticVariableExe {

	public static void main(String[] args) {
		StaticVariable a = new StaticVariable("Shubham Kumawat");
		System.out.println(a);
		//Use Class name to print Static variable
		System.out.println(StaticVariable.companyName);
	}

}
