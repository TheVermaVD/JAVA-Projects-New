package com.simplilearn.phase1.basic;
import java.util.Scanner;

public class MethodJava {

	public int addition(int a, int b)
	
	{
		return a+b;// TODO Auto-generated method stub

	}
	
	public static void main(String[] args) {
		
		MethodJava o=new MethodJava();
		
		Scanner  obj=new Scanner(System.in);
		System.out.println("Enter The Two Numers");
		
		int c=obj.nextInt();
		int d=obj.nextInt();
		
		int z=o.addition(c,d);
		
		System.out.println("Sum of Two Number is= "+z);
	}

}
