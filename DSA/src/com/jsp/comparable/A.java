package com.jsp.comparable;

import java.util.Comparator;

public class A implements Comparator<Book>
{

	public static void main(String[] args) {
     
	}

	@Override
	public int compare(Book o1, Book o2) {
		if(o1.price>o2.price)return 1;
		if(o1.price>o2.price)return -1;
		else return 0;
		
	}

}
