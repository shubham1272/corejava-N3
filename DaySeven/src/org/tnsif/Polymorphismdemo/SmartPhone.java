package org.tnsif.Polymorphismdemo;
//Method Overloading
public class SmartPhone {
	private int resolution;
	private String slottype;
	//method overloading in  terms of passing Arguments
	void display(int resolution) {
		System.out.println("My camera Resolution"+resolution);
		
	}
	void display(int resolution,String slottype) {
		System.out.println("My camera Resolution"+resolution+"The Slot type is : "+slottype);
	}
	public int getResolution() {
		return resolution;
	}
	public void setResolution(int resolution) {
		this.resolution = resolution;
	}
	public String getSlottype() {
		return slottype;
	}
	public void setSlottype(String slottype) {
		this.slottype = slottype;
	}
	
	}
	
