package rprgrms;

import java.util.Scanner;

public class PrintMultiple {

	public static void main(String[] args) {
     int n=new Scanner(System.in).nextInt();
     System.out.println(prod(n));
	}
	public static int prod(int n) {
		if(n==0)return 1;
		if(n==1)return n;
		return n*=prod(n-1);
	}

}
