package com.simplilearn.collection;

import java.util.ArrayList;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Vector<String> name=new Vector<>();
		
		name.add("Prakash");
		name.add("Anil");
		name.add("pankaj");
		name.add("Suraj");
		name.add("Chandan");
		
		System.out.println(name);
		
		name.remove(0);
		System.out.println(name);

	}

}
