package com.simplilearn.array;

import java.util.Scanner;

public class MultiDimentionalArray {

	public static void main(String[] args) {

//		int a[][] = { { 1, 2, 3 }, { 8, 9, 10 }, { 20, 30, 40 } };
//
//		// System.out.println(a.length); // length=3
//
//		for (int row = 0; row < a.length ; row++) //length=3  //0,0   0,1   0,2
//			
//			                                                 // 1,0   1,1   1,2
//			                                              
//			                                                 // 2,0   2,1   2,2
//		
//
//              {
//					for (int col = 0; col < a.length; col++) 
//							{
//
//							System.out.print(a[row][col] + "\t");
//							}
//							System.out.println();
//
//              }
//		
		
		// TAking from user values
		
		int array[][]=new int[3][3];
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter The values : ");
		
		for (int row = 0; row < array.length ;row++)
		{

			for (int col = 0; col < array.length; col++) 
					{
							array[row][col]=obj.nextInt();
					}
					System.out.println();

      }
//Printing same Values
		

		for (int row = 0; row < array.length ;row++)
		{

			for (int col = 0; col < array.length; col++) 
					{
							System.out.print(array[row][col]+"\t1");
					}
					System.out.println();

      }
		
		obj.close();
	}
}
