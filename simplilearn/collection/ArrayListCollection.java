package com.simplilearn.collection;

import java.util.ArrayList;

public class ArrayListCollection {
	
	public static void main(String[] args) {
		
		ArrayList<String> name=new ArrayList<>();
		
		name.add("Prakash");
		name.add("Anil");
		name.add("pankaj");
		name.add("Suraj");
		name.add("Chandan");
		
		System.out.println(name);
		
		name.remove(0);
		System.out.println(name);
		
		System.out.println("To get a perticular element= "+name.get(3));
		System.out.println("Chech whether a element is exist or not ="+name.contains("Diya"));
		System.out.println("Know the size= "+name.size());
		
		//adding Prakash to 1st position
		
		name.add(0,"Prakash");
		
		
		//ADD a name after Prakash
		
		name.add(1, "Dhriti");
		
		System.out.println(name);
		
		for(String data:name)
		{
			System.out.println(data);
		}
			
	}

}
