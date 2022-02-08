package com.simplilearn.first.liveclass;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo { //Set : Doesn't Allow Duplicate Entry

	public static void main(String[] args) {
		
		HashSet<Integer> set=new HashSet<>(); //No Order Preserve, Element in any order
		
				set.add(10);
				set.add(20);
				set.add(90);
				set.add(10);
				set.add(50);
				set.add(60);
				
				System.out.println(set);
				
		LinkedHashSet<Integer> set2=new LinkedHashSet<>(); // Element In Same Order
		
				
				set2.add(10);
				set2.add(20);
				set2.add(90);
				set2.add(10);
				set2.add(50);
				set2.add(60);
				
				System.out.println(set2);
				
        TreeSet<Integer> set3=new TreeSet<>(); //Sorted In Ascending Order
        set3.add(10);
		set3.add(20);
		set3.add(90);
		set3.add(10);
		set3.add(50);
		set3.add(60);
		
		System.out.println(set3);
        
        
		
		
	}
	
	

}
