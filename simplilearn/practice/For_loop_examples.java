package com.simplilearn.practice;

public class For_loop_examples {
	
	public static void main(String[] args) {
		
		//Print 50 natural number
		
		for(int i=1; i<=50; i++)
			
			System.out.println(i);
		
		System.out.println("Print Odd 50 numbers ");	
		
		for(int i=1;i<=50; i++)
		{
			System.out.println(i);
			i++;
			
		}
		
		System.out.println("Sum of 1st 10 numers ");
		
		int s=0;
		
		for(int i=1;i<=10;i++)
		
			
			s=s+i;
		
		System.out.println(s);
		
	}

}
