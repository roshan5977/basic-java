package com.DARK_WORLD_CODING.CODE_WITH_LUCKY;

import java.util.Scanner;


public class Cwl_Test_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		boolean flag=true;
		if (n<2) return;
		for(int i=2;i<=n/2;i++)
		{
			if (n%i==0) {
				flag=false;
				break;
			}
		}
		if (flag) System.out.println("THIS IS A PRIME NUMBER");
	}

}
