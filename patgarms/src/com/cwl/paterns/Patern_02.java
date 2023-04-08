package com.cwl.paterns;
import java.util.Scanner;
public class Patern_02 {
	public static void main(String[] args) {
    int n=new Scanner(System.in).nextInt(),n1=1,n2=1,stars=1,star=0,spaces=n/2;
    for(int i=1;i<=n;i++)
    {
    	for(int j=1;j<=spaces;j++)
    	{
    		System.out.print(" ");
    	}
    	n1=1;
    	for(int j=1;j<=stars;j++)
    	{
    		System.out.print(n1);
    		n1++;
    	}
    	if (i<=n/2) {
			n2=i-1;
    	}
		else
		{
    		n2=n-i;
		}
    	for(int j=1;j<=star;j++)
    	{
    			System.out.print(n2);
    			n2--;
    	    	}
    	if (i<=n/2) {
			stars++;
			spaces--;
			star++;
		}
    	else
    	{
    		stars--;
    		spaces++;
    		star--;
    	}
    	System.out.println();
    }
	}
}