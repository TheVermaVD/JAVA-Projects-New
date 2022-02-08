package com.simplilearn.collection;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		
		LinkedList<Integer> n=new LinkedList<>();
		
		n.add(20);
		n.add(21);
		n.add(5);
		n.add(2);
		n.add(15);
		
		System.out.println(n);
		
		System.out.println(n.size());
		System.out.println(n.get(4));
		n.add(2,50);
		System.out.println(n);
		n.removeFirst();
		n.removeLast();
		System.out.println(n);
		
		n.addFirst(1);
		n.addLast(100);
		
		System.out.println(n);
		
		for(Integer m:n)
			
		{
			System.out.println(m);
		}
		
		
		
 	}

}
