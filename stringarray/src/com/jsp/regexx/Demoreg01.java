package com.jsp.regexx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demoreg01 {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String n=sc.next();
      Pattern p=Pattern.compile("[0-9][a-z]");
      Matcher m=p.matcher(n);
//      System.out.println("++++++++");
//      while(m.find())
//      {
//    	  System.out.println("++");
//    	  System.out.println(m.group());//print the grouped found from start
//    	  ///////////System.out.println(m.group(5));//print the ...
//    	 ////////////// System.out.println(m.group("y"));//print the...
//    	  System.out.println(m.groupCount());//count the grouped
//    	  System.out.println(m.pattern());//return pattern that is interpreted by matcher
//    	  String t=m.replaceAll("5");
//    	  System.out.println(t);
//    	 String t1= m.replaceFirst("5");
//    	 System.out.println(t1);
//    	 System.out.println(m.start());
//    	/////////////// System.out.println(m.start(5));
//    	/////////// System.out.println(m.start(n));
//      }
      Matcher m1=m.reset("0a1na3m8ik9a");
      System.out.println(m1.start());0-=
      System.out.println(m1.find());
      System.out.println(m1.find());
      System.out.println(m1.group(3));
      Pattern c=Pattern.compile("[0-9]");
      m1.usePattern(c);
      System.out.println(m1.find());
      System.out.println(m1.group());
      
      sc.close();
	}

}
