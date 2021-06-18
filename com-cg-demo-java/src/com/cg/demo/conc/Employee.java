package com.cg.demo.conc;


class Employee {

	// fields

	private Employee() {
		System.out.println("Employee()");
	}

	public void work() {
		System.out.println("Employee works...");
	}

	public static Employee getEmployee() {
		return new Employee();
	}

}

