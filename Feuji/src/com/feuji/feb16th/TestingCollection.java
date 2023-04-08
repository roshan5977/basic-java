package com.feuji.feb16th;

import static org.junit.Assert.assertEquals;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.Test;

public class TestingCollection {

	@Test
	public void test() {
		TreeSet<FeujiEmployee> col=CorenutsTest.getEmployeesTreeSet();
		TreeSet<FeujiEmployee> hashSet2 = new TreeSet<>();
		hashSet2.add(new FeujiEmployee("Sonali", 24, "java"));
		hashSet2.add(new FeujiEmployee("Venum", 24, "java"));
		hashSet2.add(new FeujiEmployee("Priyanaka", 24, "java"));
		hashSet2.add(new FeujiEmployee("Anushka", 24, "java"));
		Iterator<FeujiEmployee> i1=col.iterator();
		Iterator<FeujiEmployee> i2=hashSet2.iterator();
		for(int i=1;i<=4;i++) {
			assertEquals(i2.next(), i1.next());
			
			System.out.println("1");
		}
		
	}
}
