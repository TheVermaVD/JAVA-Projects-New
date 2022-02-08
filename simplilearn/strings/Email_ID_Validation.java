package com.simplilearn.strings;

import java.util.ArrayList;
import java.util.Scanner;

public class Email_ID_Validation {

	public static void main(String[] args) {

		ArrayList<String> emails = new ArrayList<>();

		emails.add("rahul123@gmail.com");
		emails.add("suraj@gamil.com");
		emails.add("Krishna@gmail.com");
		emails.add("rakesh54@gmail.com");
		emails.add("Kiran43@gmail.com");
		emails.add("Prakash23@gmail.com");
		emails.add("Shyam78@gmail.com");

		Scanner obj = new Scanner(System.in);

		System.out.println("Provide Your Email Id : ");

		String in = obj.nextLine();

		if (emails.contains(in)) {

			System.out.println("Email Validated");
		} else
			System.out.println("Invalid Email,Try Again");

		obj.close();

	}
}