package com.simplilearn.practice;

import java.util.Scanner;

public class Concept_of_loop {
	
	// Table of any number
	
	public static void main(String[] args) {
		System.out.println("ENter a number= ");
		Scanner in=new Scanner(System.in);
		
		int a=in.nextInt();
		
//		System.out.println(a*1);  // i=1
//		System.out.println(a*2);
//		System.out.println(a*3);
//		System.out.println(a*4);
//		System.out.println(a*5);
//		System.out.println(a*6);
//		System.out.println(a*7);
//		System.out.println(a*8);
//		System.out.println(a*9);
//		System.out.println(a*10);  //i=10
		
		 
		for(int i=1;i<=10;i++ )
			
			System.out.println(a*i);
		
	}

}
