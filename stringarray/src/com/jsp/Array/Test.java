package com.jsp.Array;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	public static void main(String[] args) {
   Pattern p=Pattern.compile("([0-9])\\1");
   Matcher m=p.matcher("3jbjd332jf32j3ffjbf");
  while( m.find())
  {
	  System.out.println( m.group());
	  System.out.println(m.start());
  }
   
	}



}
