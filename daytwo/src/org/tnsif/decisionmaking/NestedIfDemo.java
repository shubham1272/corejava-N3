package org.tnsif.decisionmaking;

import java.util.Scanner;

public class NestedIfDemo {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("enter the age and weight");
		int age=s.nextInt();
		int weight=s.nextInt();
		if(age>=12)
		{
			if(weight>=40)
				
			{
				if(weight<120)
				{
					System.out.println("You are Eligible");
				}
				else 
				{
					System.out.println("You are not eligible due to High Weigh");
				}
			}
			else
			{
				System.out.println("You are not eligible due to low weight");
			}
			
		}	
		else
		{
			System.out.println("You are not Eligible due to Age");
		}
		

	}

}
