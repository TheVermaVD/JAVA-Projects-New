package com.simplilearn.phase1.basic;

import java.util.Scanner;

public class ValidForVote {
	
	public static void main(String[] args) {
		
		 Scanner in=new Scanner(System.in);
		 	
		 System.out.println("Enter The Age= ");
		 
		 int a=in.nextInt();
		 
		 if(a>=18)
			 System.out.println("Eligible For Vote");
		 else
			 System.out.println("Not Eligile for Vote");
		 
		 		 
		 		 
		 		 
	}
}
