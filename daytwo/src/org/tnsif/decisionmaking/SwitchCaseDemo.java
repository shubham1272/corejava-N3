package org.tnsif.decisionmaking;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Choose the song : ");
		int song=s.nextInt();
		switch(song)
		{
			case 1:
				System.out.println("Kesariya song");
				break;
			case 2:
				System.out.println("Rap god");
				break;
			case 3:
				System.out.println("Calm Down");
				break;
			default :
				System.out.println("Select the correct Option ");
		}
	}

}
