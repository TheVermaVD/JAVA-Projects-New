package com.simplilearn.collection;

import java.util.HashSet;

public class HashSetDemo {
	
	public static void main(String[] args) {
		
		HashSet<String> name=new HashSet<>();
		
		name.add("RAhu");
		name.add("Rohit");
		name.add("praksh");
		name.add("suraj");
		System.out.println(name);
		
		name.add("suraj");
		System.out.println(name);
		
		System.out.println("Is Empty="+name.isEmpty());
		
		name.remove("praksh");
		
		System.out.println("Size="+name.size());
		
		
		
	}

}
