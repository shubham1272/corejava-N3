package org.tnsif.encapsulationdemo;

public class ICICI {
	private int pin;
	void accept()
	{
		System.out.println("The ATM Pin ia: "+pin);
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
}
