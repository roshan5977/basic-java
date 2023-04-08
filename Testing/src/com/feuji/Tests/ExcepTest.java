package com.feuji.Tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExcepTest {
	@Test(expected = 	ArithmeticException.class)
	public void test(){
		Excep.checkexcep();
	}
	@Test(timeout = 1000)
	public void test1() {
		Excep.looptime();
	}
	
}
