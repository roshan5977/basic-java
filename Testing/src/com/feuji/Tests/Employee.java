package com.feuji.Tests;

public class Employee {
int id;
String name;
int sal;
public Employee(int id, String name, int sal) {
	super();
	this.id = id;
	this.name = name;
	this.sal = sal;
}
public int showSal(int increment) {
	return sal+increment;
}
}
