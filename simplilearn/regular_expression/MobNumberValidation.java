package com.simplilearn.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobNumberValidation {

	public static void main(String[] args) {
		
		//Accept 10 numbers and 1st digit start from 7,8 or 9.
		
		Pattern p=Pattern.compile("[789][0-9]{9}");
		Matcher m=p.matcher("7583844549");
			
	  //System.out.println(m.matches());
		
		if(m.matches())
			System.out.println("Qualify Mob No User Criteria");
		
		else
			System.out.println("Wrng Mob No formate");

	}

}
