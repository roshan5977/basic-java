package com.jsp.stringprogram;

import java.util.Scanner;

public class CountOccurances {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the word");
    String s=sc.next();
    System.out.println("Enter the leter u wanna repeat");
    String s1=sc.next();
    String s2=s.replace(s1, "");
    int count=s.length()-s2.length();
    count/=s1.length();
    System.out.println(s1+" has counted in "+s+"  as "+count+" times.");
	}

}
