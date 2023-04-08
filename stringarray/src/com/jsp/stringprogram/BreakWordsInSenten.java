package com.jsp.stringprogram;

import java.util.Scanner;

public class BreakWordsInSenten {

	public static void main(String[] args) {
    String s=new Scanner(System.in).nextLine();
                s=s.trim();
               String[] arr=s.split(" ");
               for(String t:arr)
               {
            	   System.out.println(t);
               }
	}
}
