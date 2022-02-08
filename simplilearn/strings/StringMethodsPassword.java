package com.simplilearn.strings;

import java.util.Scanner;

public class StringMethodsPassword {

	public static void main(String[] args) {

		String s = "Hello World";

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Your Password");

		String pwd = obj.next();

		if(pwd.equals(s))
			
			System.out.println("Authenticated");
		
		else
			System.out.println("Wrong PassWord");

//		if (pwd.equalsIgnoreCase(s)) //Ignore the character upper case or lower case
//
//			System.out.println("Authenticated");
//
//		else
//			System.out.println("Wrong PassWord");
//		
		obj.close();

	}

}
