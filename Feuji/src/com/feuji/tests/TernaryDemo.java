package com.feuji.tests;
import java.util.Scanner;
public class TernaryDemo {
public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int one=sc.nextInt();
  int two=sc.nextInt();
  int three=sc.nextInt();
  System.out.println(one>two?(one>three?one:three):(two>three?two:three));
	}
}
