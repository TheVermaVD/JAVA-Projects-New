package com.simplilearn.strings;

public class StringDemo {
	
	public static void main(String[] args) {
		
		String str="Prakash Rowdy";
		System.out.println(str.length());//size of string
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		String str2=new String("Prakash Rowdy");
		
		if(str.equals(str2))
			System.out.println("Both r equal");
		else
			System.out.println("both r not equal");
		
		//Immutability Chech//
		
		String str3="Rahul";
		
		str3.concat(" Kumar");
		
		System.out.println(str3);
		
		//we can make it Mutable by creating duplicate //
		
		String str4=str3.concat(" Kumar");
		System.out.println(str4);
		
		
	}

}
