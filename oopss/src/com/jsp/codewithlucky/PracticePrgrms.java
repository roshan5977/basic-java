package com.jsp.codewithlucky;
import java.util.Scanner;
public class PracticePrgrms {

	public static void main(String[] args) {
		//armstrong
		System.out.println("enter a num");
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int p=sc.nextInt();
		for(int i=k;i<=p;i++)
		{
			int temp=i;
		   int len=0;
			while (i>0){
				i/=10;
				len++;
			}
			i=temp;
			int sum=0;
			while (i>0) {
				int hold=i%10;
				sum+=(int)Math.pow(hold,len);
				i/=10;
			}
		if (sum==temp) {
			System.out.println(i);
		}
		}
	}
}
