package org.tnsif.Assignment;
import java.util.*;
public class CountDigit {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int a=0;
        System.out.println("Enter the number:");
        int n=s.nextInt();
        String x=Integer.toString(n);
        for(int i=0;i<x.length();i++){
            a++;
        }
        System.out.println(a);

	}

}
