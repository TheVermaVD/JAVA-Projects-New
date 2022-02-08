package com.simplilearn.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuantifiersDemo {

	public static void main(String[] args) {

		
		Pattern p1=Pattern.compile("[a-zA-z0-9]");
		Matcher m1=p1.matcher("");
		
		System.out.println(m1.matches());
		
		Pattern p2=Pattern.compile("[a-zA-z0-9]{4,}");
		Matcher m2=p2.matcher("Poe8");
		
		System.out.println(m2.matches());
			
			
			
		Pattern p=Pattern.compile("[A-Z]{4,6}");
		Matcher m=p.matcher("ROWDYP");
			
	   System.out.println(m.matches());
	   
//	   Pattern p3=Pattern.compile("[A-Z]*"); // letter occur 0 or more times
//		Matcher m3=p3.matcher("");
//			
//	   System.out.println(m3.matches());
	   
	   Pattern p3=Pattern.compile("[A-Z]+"); // letter occur Atleast 1 or more times
		Matcher m3=p3.matcher("A");
			
	   System.out.println(m3.matches());
	   
	   
	   
	}

}
