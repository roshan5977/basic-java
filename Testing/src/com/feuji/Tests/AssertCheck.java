package com.feuji.Tests;

import static org.junit.Assert.assertEquals;
import  com.feuji.*;
import org.junit.After;
import org.junit.Before;

public class AssertCheck {
	int id;
	String name;
	Employee emp;
	@Before
	public void TestEmployee() {
		emp=new Employee(21, "Roshan", 2000);
		
	}
	@org.junit.Test
	public void TestCollection() {
		
	}
@org.junit.Test
	public void sal() {
    assertEquals(3000,emp.showSal(1000));
	}
	@Before
	public void TestBef() {
		System.out.println(id+"bef");
		id=2;
		name="kiran";
	}
	@org.junit.Test
	public void Test() {
		System.out.println(id);
	}
	@After
	public void AfTest() {
		id=10;
		System.out.println(id+"after");
	}
	
	

}
