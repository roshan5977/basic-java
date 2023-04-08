package com.feuji.feb16th;

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.LinkedHashSet;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.ListIterator;
//import java.util.Set;
//import java.util.Spliterator;
import java.util.*;

public class CorenutsTest {

	public static void main(String[] args) {
		ArrayList<FeujiEmployee> employees = new ArrayList<>();
		employees.add(new FeujiEmployee("Roshan", 24, "java"));
		employees.add(new FeujiEmployee("Sai", 16, "javaScript"));
		employees.add(new FeujiEmployee("siva kumari", 11, "junit"));
		employees.add(new FeujiEmployee("Trushali", 19, "CSS"));
		employees.add(new FeujiEmployee("Rashmi", 26, "html"));

		Collections.synchronizedList(employees);
//		return and display ArrayList
//        List list = Collections.synchronizedList(new ArrayList());
//        ...
//    synchronized (list) {
//        Iterator i = list.iterator(); // Must be in synchronized block
//        while (i.hasNext())
//            foo(i.next());
//    }

		employees.add(2, new FeujiEmployee("Mohan", 14, "java"));
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		employees.contains(new FeujiEmployee("Roshan", 24, "java"));
		employees.forEach(System.out::println);
		System.out.println("+++++++++++++++++++++++++++++++++");
		employees.get(1);
		employees.indexOf(new FeujiEmployee("Trushali", 19, "CSS"));
		System.out.println(employees.isEmpty());

		Collections.sort(employees);
		
		Comparator<FeujiEmployee> com = new Comparator<FeujiEmployee>() {

			@Override
			public int compare(FeujiEmployee o1, FeujiEmployee o2) {
				return o1.getId()-o2.getId();
			}
		};

//		System.out.println("2++++++++++++++++++++++++++++++++++++++++++");
//		for (ListIterator<FeujiEmployee> iter = employees.listIterator(1); iter.hasPrevious(); iter
//				.forEachRemaining(System.out::println))
//			;

//System.out.println("1+++++++++++++++++++++++++++++++++++++++++++++");
//		int i = 1;
//		for (Spliterator<FeujiEmployee> iter = employees.spliterator(); i <= iter.estimateSize(); iter
//				.forEachRemaining(System.out::println))
//			;

//		System.out.println("1+++++++++++++++++++++++++++++++++++++++++++++");
//		int i = 1;
//		for (Spliterator<FeujiEmployee> iter = employees.spliterator(); i <= iter.getExactSizeIfKnown(); iter
//				.forEachRemaining(System.out::println))
//			;

//		System.out.println("1+++++++++++++++++++++++++++++++++++++++++++++");
//		int i = 1;
//	Spliterator<FeujiEmployee> iter = employees.spliterator();
//	  System.out.println( iter.getComparator());

//	  ArrayList<String> lst=new ArrayList<>();
//	  lst.add("34");
//	  lst.add("we");
//	  lst.add("gfdey");
//			Arrays.asList(null)

		System.out.println("hash");
		Set<FeujiEmployee> hashSet1 = (Set<FeujiEmployee>) getEmployeesHash();
		System.out.println(hashSet1.size());
		hashSet1.add(new FeujiEmployee("Madhu", 43, "telgu"));
//			hashSet1.removeIf(e->e.getId()%2!=0);
		hashSet1.removeIf(e -> e.getName().charAt(0) == 'V');
		System.out.println(hashSet1.size());

		System.out.println("display");
		display(hashSet1);

		System.out.println("linked Hash");
		Set<FeujiEmployee> linkhashSet1 = (Set<FeujiEmployee>) getEmployeesLinkHash();

		display(linkhashSet1);

		System.out.println("TreeSet");
		Set<FeujiEmployee> treeset1 = (Set<FeujiEmployee>) getEmployeesTreeSet();

		display(treeset1);
		System.out.println("comparable sorted");

	}

	public static TreeSet<FeujiEmployee> getEmployeesTreeSet() {
		TreeSet<FeujiEmployee> treeset = new TreeSet<>();
		treeset.add(new FeujiEmployee("Sonali", 24, "java"));
		treeset.add(new FeujiEmployee("Venum", 24, "java"));
		treeset.add(new FeujiEmployee("Priyanaka", 24, "java"));
		treeset.add(new FeujiEmployee("Anushka", 24, "java"));
		return treeset;
	}

	public static Collection<FeujiEmployee> getEmployeesLinkHash() {
		Set<FeujiEmployee> linkhash = new LinkedHashSet<>();
		linkhash.add(new FeujiEmployee("Prakash", 24, "java"));
		linkhash.add(new FeujiEmployee("Promod", 24, "java"));
		linkhash.add(new FeujiEmployee("Priyanaka", 24, "java"));
		linkhash.add(new FeujiEmployee("Anushka", 24, "java"));
		return linkhash;
	}

	public static HashSet<FeujiEmployee> getEmployeesHash() {
		HashSet<FeujiEmployee> hashSet = new HashSet<>();
		hashSet.add(new FeujiEmployee("Prakash", 24, "java"));
		hashSet.add(new FeujiEmployee("Venum", 24, "java"));
		hashSet.add(new FeujiEmployee("Varyn", 24, "java"));
		hashSet.add(new FeujiEmployee("Tarun", 24, "java"));
		hashSet.add(new FeujiEmployee("Sonali", 24, "java"));
		return hashSet;

	}

	public static void display(Set<FeujiEmployee> set) {

		
		
		/**
		 * 1. Object Arr[]=set.toArray(); for(Object a:Arr) { System.out.println(a); }
		 */

		/**
		 * set.toArray(String[]fe);---try it!!
		 */

		/**
		 * set.forEach(System.out::println);
		 */

//		for (Iterator i = set.iterator(); i.hasNext(); i.forEachRemaining(System.out::println))
//			;

		
		
		 

		/**
		 * set.toArray java 11 This method acts as a bridge between array-based and
		 * collection-based APIs. It allows creation of an array of a particular runtime
		 * type. Use toArray() to create an array whose runtime type is Object[],or use
		 * toArray(T[]) to reuse an existing array. Suppose x is a collection known to
		 * contain only strings. The following code can be used to dump the collection
		 * into a newly allocated array of String: String[] y =
		 * x.toArray(String[]::new);
		 */
		
		

	}
}
