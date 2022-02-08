package com.simplilearn.practice;

import java.util.Scanner;

public class Method {
	
	static int sum(int a, int b) {
		
		int z=(a+b)/2;
		
		return z;
					
				
	}
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("ENter two number= ");
		int a=in.nextInt();
		int b=in.nextInt();
		
		int z=sum(a,b);
		
		//System.out.println("Sum of two number is="+z);
		
		System.out.println("Sum of two no is= "+sum(a,b));			
				
	}
	
	
	

}

	

