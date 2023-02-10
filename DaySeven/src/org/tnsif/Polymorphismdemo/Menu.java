package org.tnsif.Polymorphismdemo;
//abstract class and Abstract method Program 
//abstract class 

public abstract class Menu {
	//abstract method
	abstract void recipe();
	abstract void foodtype();
	//non abstract method
	void menuType() {
		System.out.println("Veg and Non Veg");
	}
	
}
