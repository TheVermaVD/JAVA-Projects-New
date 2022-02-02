package com.simplilearn.first.condition;

import java.util.Scanner;

public class PasswordCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter the password= ");
		
		int a=obj.nextInt();
		
		if(a==5432)
			System.out.println("UNLOCK");
		else
			System.out.println("WRONG PASSWORD..Try Again");
		
		
				
				

	}

}
