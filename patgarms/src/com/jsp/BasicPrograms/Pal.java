package com.jsp.BasicPrograms;
import java.util.Scanner;
public class Pal {
	public static void main(String[] args) {
     int a=new Scanner(System.in).nextInt(),rev = 0;
    int temp=a;
     while(a>0)
     {
    	 int hold=a%10;
    	rev+=hold;
    	rev*=10;
    	 a/=10;
     }
     rev/=10;
    if(rev==temp)System.out.println("pal");
    else System.out.println("not pal");
	}
}
