package com.jsp.unsolves;
import java.util.Scanner;
public class MiddleDigitNum {
	public static void main(String[] args) {
		System.out.println("enter a num");
		int n = new Scanner(System.in).nextInt(),result=0,count=0;
		for (int i = 1,temp=n; temp > 0; i++, temp/=10)count++;
	for(int j=1;j<=(count/2)+1;j++,n/=10) result=n%10;
	System.out.println(result);
	}
}
