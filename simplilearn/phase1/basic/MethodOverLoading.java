package com.simplilearn.phase1.basic;

public class MethodOverLoading {

		public static int add(int a,int b)
		{
		return a+b;
		}
		public static int add(int a,int b,int c)
		{
			return a+b+c; 
		}
		public static float add(float a,float b)
		{
			return a+b;
		}
		public static double add(double a,double b,double c)
		{
			return a+b+c;
		}
		
	    public static void main(String[] args) {
	    	
	    	int x=add(10,20,30);
	    	float y=add(10.5f,20.3f);
	    	double z=add(10.5,20.3,10.1);
		
		
		System.out.println("Sum of integer is= "+x); 
		System.out.println("Sum of float values is= "+y);
		System.out.println("Sum of double values is= "+z);
		
	}
		



}
