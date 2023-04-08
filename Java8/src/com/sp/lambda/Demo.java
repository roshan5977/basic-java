package com.sp.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo {

	public static void main(String[] args) {
		ArrayList<Book> self = new ArrayList<>();
		self.add(new Book(34525, "english", 500.0));
		self.add(new Book(64526, "maths", 780.0));
		self.add(new Book(43754, "hindi", 430.0));
		self.add(new Book(76276, "urdu", 600.0));
		self.add(new Book(23458, "history", 940.0));
		self.add(new Book(78436, "civics", 200.0));
		self.add(new Book(74360, "physics", 800.0));
		self.add(new Book(78923, "chemistry", 900.0));

//		Comparator<Book> com = new Comparator() {
//			@Override
//			public int compare(Object o1, Object o2) {
//				Book b = (Book) o1;
//				Book b1 = (Book) o2;
//				return b.getName().compareTo(b1.getName());
//			}
//		};
		Comparator<Book> com=(o1,o2)->{
			Book b = (Book) o1;
			Book b1 = (Book) o2;
			return b.getName().compareTo(b1.getName());
		};
		Collections.sort(self, com);
		for (Book b : self)
			System.out.println(b);

	}
}
