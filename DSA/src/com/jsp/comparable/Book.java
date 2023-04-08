package com.jsp.comparable;

import java.util.Arrays;

public class Book implements Comparable<Book> {
	String title;
	double price;

	public Book(String t, double p) {
		title = t;
		price = p;
	}
	@Override
	public String toString() {
		return "[ title=" + title + ",price=" + price + "]";
	}
   @Override
	public int compareTo(Book b) {
		if(price>b.price)return -1;
		if(b.price>price)return 1;
		else return title.compareTo(b.title);
	}
   

	public static void main(String[] args) {
		Book[] b = new Book[4];
		b[0] = new Book("java", 100.0);
		b[1] = new Book("sql", 100.0);
		b[2] = new Book("c++", 100.0);
		b[3] = new Book("python", 129.6);
		Arrays.sort(b);
		for(Book x:b)System.out.println(x);
	}

}

