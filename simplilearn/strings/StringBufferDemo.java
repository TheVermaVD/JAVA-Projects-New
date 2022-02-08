package com.simplilearn.strings;

public class StringBufferDemo {
	
	public static void main(String[] args) {
		
		StringBuffer str=new StringBuffer("Prakash");
		
		System.out.println(str.charAt(2));// Character at index 2=a
		
		System.out.println(str.length());
		System.out.println(str.reverse());
		
		System.out.println(str.reverse());
		
		System.out.println(str.replace(0, 3,"Dhriti"));
		
		//Same code for StringBuilder, it is more faster than StringBuffer as it's not sychronised(not thread safe) 
	
	String s="Rowdy Prakash";
	
	StringBuilder str1=new StringBuilder(s);
	
	System.out.println(str.charAt(2));// Character at index 2=a
	
	System.out.println(str.length());
	System.out.println(str.reverse());
	
	System.out.println(str.reverse());
	
	System.out.println(str.replace(0, 3,"Dhriti"));
	
	
		
		
		
	}
}
