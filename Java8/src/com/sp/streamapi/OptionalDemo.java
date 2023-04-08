package com.sp.streamapi;

import java.util.Optional;

/**
 * Optional
 * @author HP
 * To avoid NullPointer exception java8 has provided Optional class to checknull values
 * 
 *
 */
public class OptionalDemo {
public static void main(String[] args) {
	String[] words=new String[10];
	words[5]="HYY";
//	String word=words[5].toLowerCase();//java.lang.NullPointerException
System.out.println(Optional.ofNullable(words[5]));
Optional<String> o=Optional.ofNullable(words[5]);
//o.get()
//o.getClass()
//ofNullable
//isEmpty
     if(!o.isEmpty())System.out.println(words[5].toLowerCase());
     if(!o.isEmpty())System.out.println(o.get());
     if(!o.isEmpty())System.out.println(o.getClass());
     
}
}
