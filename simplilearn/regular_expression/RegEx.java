package com.simplilearn.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
	
	public static void main(String[] args) {
		
		Pattern p=Pattern.compile("[a-zA-z0-9]");
		Matcher m=p.matcher("R");
		//Printing User input matches with given pattern or not with boolean method
		System.out.println(m.matches());
		
		
		Pattern p2=Pattern.compile("[^a-zA-z0-9]");
		Matcher m2=p2.matcher("$");
		
		System.out.println(m2.matches());
			
			
			
		Pattern p1=Pattern.compile("[a-zA-z0-9]owdy");
		Matcher m1=p1.matcher("Rowdy");
			
	   System.out.println(m1.matches());
			
			
			
	}

}
  