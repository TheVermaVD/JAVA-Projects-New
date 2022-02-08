package com.simplilearn.practice;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		
		
		System.out.println("Enter the numer for which factorial is required= ");
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt();
			int f=1;
			
		for(int i=n;i>=1;i-- )
			{
			
		    f=f*i;
			}
			
			System.out.println("Factorial is = "+f);
			
			
			
	}
	
	

}
