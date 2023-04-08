package com.jsp.Objclssmtd;

class Book 
{
	String title;

	public Book(String title) {
		super();
		this.title = title;
	}
	@Override
	public String toString()
	{
		return "Book["+title+"]";
	}
}
public class Demo1 {

	public static void main(String[] args) {

		Book b1 = new Book("java");
		System.out.println(b1);
		//println method with argument as object how it will know it is book type object
		//so args is Object arg  in object class so with Object class reference Object obj 
		//with upcasting we r passing the object reference from book class that is b1 
		//the book obj is passed nd upcasted with Object obj ;;;inside println in printstream class
		//we r calling object class getclass method;; we can overide toString() method.
		//we can return the properties too ;
		Book b2 = new Book("Joyson");
		System.out.println(b2);
		System.out.println(b1==b2);
		System.out.println(b1.equals(b2));
	}

}
 