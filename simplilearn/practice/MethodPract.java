package com.simplilearn.practice;

public class MethodPract {
	
	public static void main(String[] args) {
		
		int a=5;
		int b=6;
		int c=call(a,b);
		
		System.out.println(c);
		
		
		
	}
	
	static int call(int x, int y) {
		
		int z;
		
		if(x>y)
		{
			
			z=x+y;
	
		}
		else
		{
			
			z=x-y;
		}
		return z;
		
	}

}
