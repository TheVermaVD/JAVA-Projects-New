package com.simplilearn.phase1.basic;
import java.util.Scanner;

public class AddUsingMethod {

	public static void main(String[] args) {
		
		Scanner  obj=new Scanner(System.in);
		System.out.println("Enter The Two Numers= ");
		
		int a=obj.nextInt();
		int b=obj.nextInt();
		
		
		int z=Sum(a,b);
		System.out.println("Sum is = "+z);
		

	}
	
	public static int Sum(int a,int b)
	
	{
		return a+b;
	}

}
