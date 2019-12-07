package com.tools;

public class Employee {
	public String name;
	public int age;
	public String address;
	public double salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int age, String address, double salary) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.salary = salary;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public String getAddress() {
		return this.address;
	}

	public double getSalary() {
		return this.salary;
	}
}
