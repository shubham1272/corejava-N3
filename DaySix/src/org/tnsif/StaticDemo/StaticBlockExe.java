package org.tnsif.StaticDemo;

public class StaticBlockExe {

	public static void main(String[] args) {
		System.out.println(StaticBlock.getName());
		
		StaticBlock s=new StaticBlock();
		s.accpet();
		s.display();
	}

}
