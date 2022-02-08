package com.simplilearn.phase1.basic;

public class CreatingObj {

	public static void main(String[] args) {

		Employee e1 = new Employee();

		e1.empId = 1000;
		e1.name = "Raju";
		e1.salary = 40000f;
		

		Employee e2 = new Employee();

		e2.empId = 2000;
		e2.name = "Raju";
		e2.salary = 40000f;
		System.out.println(e2.empId);
		System.out.println(e1.empId);
	}
}

class Employee {

	int empId;
	String name;
	float salary;

}
