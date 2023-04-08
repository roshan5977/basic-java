package com.jsp.stringprogram;

public class MaxOccuranceChar {

	public static void main(String[] args) {
      String s="roshann";
      String temp=s;
     int  i=0;int count=0;char max=' ';
      while(s.length()>0)
      {
    	  char c=s.charAt(0);
    	  String s1=s.replace(c+"", "");
    	  count=s.length()-s1.length();
    	  if(count>i) {
    		  i=count;
    		  max=c;
    	  }
    	  s=s1;
      }
      System.out.println("max occurance in word "+temp+" is : "+max);
	}

}
