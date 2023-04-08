package com.jsp.twoDArray;

import java.util.Scanner;

public class SumOfDiagonals {
	public static void main(String[] args) {
    int [][]a= {
    		{1,2,3},
    		{4,5,6},
    		{7,8,9}
    };
       System.out.println(sumOfDiag(a));
	}
	public static int sumOfDiag(int [][]a)
	{
		int sum=0,len=a.length;
		for(int i=0;i<len;i++)
		{
			sum+=a[i][i];
			if(len%2!=0&&i==len/2)continue;
			sum+=a[i][len-1-i];
		}
		return sum;
	}
}
