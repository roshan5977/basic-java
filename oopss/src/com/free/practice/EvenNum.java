package com.free.practice;

import java.util.Scanner;

public class EvenNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
if ((n&1)==0) System.out.println("even");
else System.out.println("odd");
	}

}
