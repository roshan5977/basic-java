package com.jsp.regexx;
import java.util.regex.*;
public class RegexxDemo {
	public static void main(String[] args) {
      Pattern p=Pattern.compile("{}");
      Matcher m=p.matcher("cdabbbdhedbaabbbbbbidjeiabb");
      while(m.find())
      {
    	  System.out.println( m.start());
    	  System.out.println(m.end());
    	  System.out.println(m.group());
      }
	}
}
