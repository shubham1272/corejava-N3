package org.tnsif.StaticDemo;

public class StaticVariable {

	private String name;
	public static String companyName="TCS";
	

	public StaticVariable(String name) {
		super();
		this.name = name;
	}
	@Override
	public String toString() {
		return "StaticVariable [name=" + name + "]";
	}
}
