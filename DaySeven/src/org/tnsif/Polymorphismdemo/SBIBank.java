package org.tnsif.Polymorphismdemo;

public class SBIBank extends RBI {
	//overriding the Parent class Method
	float getInterest() {
		System.out.println("The Interest of RBI is: "+super.getInterest());
		return 7.25f;
	}
}
