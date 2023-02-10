package org.tnsif.Polymorphismdemo;

public class VolkswagenVirtus {
	private int ccdisplacement;
	private String color;
	public int getCcdisplacement() {
		return ccdisplacement;
	}
	public void setCcdisplacement(int ccdisplacement) {
		this.ccdisplacement = ccdisplacement;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public VolkswagenVirtus() {
		System.out.println("1.5 liter Turbo charged  inline 4 cylinder engine comes with 250NM of Tourque");
		
	}
	public VolkswagenVirtus(int ccdisplacement, String color) {
		super();
		this.ccdisplacement = ccdisplacement;
		this.color = color;
	}
	

}
