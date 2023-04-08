package com.feuji.feb14th;

public class StringBufferDemo {
	public static void main(String[] args) {
    StringBuffer sb=new StringBuffer("roshan");
    StringBuffer sb1=new StringBuffer("subham");
    System.out.println( sb.capacity());
    sb.append("hyy");
    System.out.println(sb);
    System.out.println(sb.capacity());
    sb.ensureCapacity(30);
    System.out.println(sb.capacity());
    System.out.println(sb.insert(5, true));
//    System.out.println(sb);
    System.out.println(sb.insert(5, true));
    sb.append(sb1);
    StringBuffer sb2=new StringBuffer("roshansubham");
    System.out.println(sb1.equals(sb2));
   

    
    
	}
}
