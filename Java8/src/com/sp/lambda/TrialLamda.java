package com.sp.lambda;

import java.util.*;

public class TrialLamda {

//	public static void main(String[] args) {
//		List<Car> garage = new ArrayList();
//		garage.add(new Car("AUDI", 7676542, 2000000));
//		garage.add(new Car("BENZ", 6347856, 3000000));
//		garage.add(new Car("SWIFT", 8458345, 1500000));
//		garage.add(new Car("TATA", 7342662, 1200000));
//		garage.add(new Car("TESLA", 6734256, 10000000));
//		garage.add(new Car("KIA", 7834646, 500000));
//		garage.add(new Car("SUJUKI", 6734264, 900000));
////		Collections.sort(garage);
//		
//		Collections.sort(garage, (o1, o2) -> {
//			return o1.brand.compareTo(o2.brand);
//		});
//		for (Car c : garage)
//			System.out.println(c);
//	}
	public static void main(String[] args) {
		List<Student> classes = new ArrayList();
		classes.add(new Student(6756, "prakash", "java"));
		classes.add(new Student(8247, "raj", "sql"));
		classes.add(new Student(8342, "pritam", "python"));
		classes.add(new Student(8344, "simran", "mysql"));
		classes.add(new Student(2579, "anurag", "c++"));
//		Collections.sort(classes, (o1, o2) -> o1.getName().compareTo(o2.getName()));
		sortById(classes);
		for (Student c : classes)
			System.out.println(c);

	}

	public static void sortById(List<Student> l) {
		Collections.sort(l, (s1, s2) -> s1.getStuid() - s2.getStuid());
	}

	public static void sortByCourse(List<Student> l) {
		Collections.sort(l, (s1, s2) -> s1.getCourse().compareTo(s2.getCourse()));
	}

}
