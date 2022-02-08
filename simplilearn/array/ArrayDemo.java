package com.simplilearn.array;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {

		int array[] = { 10, 20, 30, 40 };
		System.out.println(array[2]);
		System.out.println(array[0]);

		System.out.println(array.length);

		// Print all element

		for (int i = 0; i <array.length; i++) // Here, array index value starts frm zero, so i=0 else it'll skip value 10.

			System.out.println(array[i]); //Printing Array with using iteration variable 'i' .
// taking marks from user and printing
		
		int a[]= new int[5];
		
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Marks");
		
		//Taking inputs from user into array
		
		for(int i=0; i<a.length; i++)
		{
			a[i]=obj.nextInt();
			
		}
		
		//Printing same input of marks
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
		
		obj.close();	
			
		
		
		
	}

}
