package com.simplilearn.phase1.basic;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a Number : ");
		int a = input.nextInt();

		if (a % 2 == 0)
			System.out.println("EVEN");
		else
			System.out.println("ODD");

	}

}
