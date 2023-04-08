package com.sp.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Vector;
//Generic or raw type
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.function.DoublePredicate;
import java.util.function.*;

public class Demo {

	public static void main(String[] args) throws Throwable {
//    Functional Interfaces

		// Function takes one returns one may be generic different type.-apply mtd
		Function<Integer, String> func = t -> "Result=" + (t * t);
		System.out.println(func.apply(3));

		// BiFunction takes two and returns one generic all different type
		// generics.-apply mtd
		BiFunction<Character, String, String> bifun = (a, b) -> b + a;
		System.out.println(bifun.apply('n', "Rosha"));

		// BinaryOperator special Bifunction of same generic types
		BinaryOperator<String> binop = (a, b) -> a + b;
		System.out.println(binop.apply("Roshan", "Nayak"));

		// Consumer takes one generic type but void return type
		Consumer<String> consumer = (a) -> System.out.println(a + " printed");
		consumer.accept("rohan");

		// BiConsumer takes two different generic types but void return type
		BiConsumer<Integer, String> biConsumer = (a, b) -> System.out.println(a + " -Integer:String- " + b);
		biConsumer.accept(200, "two hundred");

		// Predicate takes one generic type and return boolean

		// BiPredicate takes two different generic type and returns boolean

		// Supplier takes nothing but returns one that is generic type

//		grouping by

		ArrayList<Integer> list = new ArrayList<>();
		list.add(23);
		list.add(45);
		list.add(76);
		list.add(43);
		list.add(86);
		list.add(24);
		list.add(54);
		list.add(75);

//		for(Iterator<Integer> i=list.iterator();i.hasNext();)System.out.println(i.next());

		for (Iterator<Integer> i = list.iterator(); i.hasNext(); i.forEachRemaining(System.out::println))
			;

		Vector<Integer> listvec = new Vector<>();

		listvec.add(41);
		listvec.add(96);
		listvec.add(43);
		listvec.add(30);
		listvec.add(44);
		listvec.add(39);
		listvec.add(9);

		listvec.forEach(System.out::println);
//		listvec.iterator();

//		listvec.removeIf(e -> e % 2 == 0);
//		System.out.println("++++");
//		for (Enumeration<Integer> e = listvec.elements(); e.hasMoreElements();) {
//			System.out.println(e.nextElement());
////e.asIterator() returns iterator
//		}

//		listvec.stream()

		int[] numbers = { 2, 4, 5, 7, 9, 8, 3 };
		int min = Arrays.stream(numbers).reduce(3, Integer::min);
		System.out.println(min);

//		map
//		maptoint
//		maptodouble

		OptionalInt otional = Arrays.stream(numbers).findFirst();
//	listvec.clear();
		Optional optional = listvec.stream().findFirst();

		Object a = optional.orElseThrow(() -> new IllegalArgumentException("no such elements"));

		listvec.stream().mapToInt(e -> e * 2).forEach(System.out::println);
		System.out.println("++");

//   IntSummaryStatistics intSummaryStatistics=listvec.stream().mapToInt(null).summaryStatistics();
		listvec.stream().filter(e -> e % 2 == 0).collect(Collectors.toCollection(LinkedList<Integer>::new)).forEach(System.out::println);
	System.out.println("+++++");
		listvec.stream().filter(e -> e % 2 == 0).collect(Collectors.groupingBy(e->e.toString())).keySet().stream().forEach(System.out::println);
		
		
		ArrayList<Student>arrayList=new ArrayList<>();
		arrayList.add(new Student("roshan", 32, "java"));
		arrayList.add(new Student("praksh", 64, "python"));
		arrayList.add(new Student("pravu", 28, "c"));
		arrayList.add(new Student("anup", 3, "html"));
		arrayList.add(new Student("johnny", 96, "css"));
		arrayList.add(new Student("sonali", 75, "js"));
		arrayList.add(new Student("sohan", 46, "sql"));
		arrayList.add(new Student("paravat", 48, "nosql"));
		
		arrayList.stream().collect(Collectors.groupingBy(Student::getCourse,Collectors.toCollection(LinkedList<String>::new)))
Collector
	}

}
