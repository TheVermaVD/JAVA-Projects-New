package com.simplilearn.practice;

import java.util.Scanner;

public class Divisible_by_5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a numer");
		
				int n=sc.nextInt();
		
		
		
		if(n%5==0)
			System.out.println("Divisible by 5");
		else
			
			System.out.println("Not Divisible by 5");
	}
}
