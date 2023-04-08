package com.jsp.practicer;

public class Demo {

	public static void main(String[] args) {
       String s="hellojava";
       System.out.println(s.length());
       System.out.println(s.substring(4));
       System.out.println(s.substring(5,6));
       System.out.println(s.indexOf('o'));
       System.out.println(s.indexOf('a',7));
       System.out.println(s.indexOf('z'));
       System.out.println(s.indexOf("lo"));
       System.out.println("hellojava");
       String []a=s.split("o");
       for(String t:a) {
       System.out.println(t);
       }
       System.out.println(s.replace("o", "hew"));
	}

}
