package com.simplilearn.first.condition;

import java.util.Scanner;

public class GreatestTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter The Two Numers= ");
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		int b=obj.nextInt();
		
		if(a>b)
			System.out.println(a+" is the greatest number");
		else
			System.out.println(b+" is the greatest number");
		
		
	}

}
