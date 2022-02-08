package com.simplilearn.first.condition;

import java.util.Scanner;

public class MyCalculator {

	public static void main(String[] args) {

		System.out.println("Enter two numbers");
		Scanner obj = new Scanner(System.in);

		int a = obj.nextInt();
		int b = obj.nextInt();

		System.out.println("Enter 1 For Addition");
		System.out.println("Enter 2 For Substraction");
		System.out.println("Enter 3 For Multiplication");
		System.out.println("Enter 4 For Division");

		int c = obj.nextInt();

		if (c == 1)
			System.out.println("Addition is= " + (a + b));
		if (c == 2)
			System.out.println("Sustraction= " + (a - b));
		if (c == 3)
			System.out.println("Multiplication is= " + (a * b));
		if (c == 4)
			System.out.println("Division is= " + (a / b));

	}

}

