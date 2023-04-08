package com.jsp.inheritance;

import java.util.Scanner;

class Count
{
	public int len(int num)
	{
		int len=0;
		while (num>0) {
			len++;
			num/=10;
		}
		return len;
	}
}
class Armstrong extends Count
{
     public int armstrong(int num)
     {
    	 int k=len(num);
    	 int armstrong=0;
    	 while (num>0) {
			int hold=num%10;
			int prod=1;
			for(int i=1;i<=k;i++)
			{
			  prod*=hold;
			}
			 armstrong+=prod;
			num/=10;
		}
    	 return armstrong;
     }
}
class ArmstrongRange extends Armstrong
{
public void armstrongrange(int a,int b)
{
	for(int i=a;i<=b;i++)
	{
		if (i==this.armstrong(i)) System.out.println(i);
	}
}
}
public class ArmstrongNumlogic {

	public static void main(String[] args) {
	    //int num=new Scanner(System.in).nextInt();
	  //  Armstrong armObject = new Armstrong();
	  // if (armObject.armstrong(num)==num) System.out.println("Armstrong num");
	//    else System.out.println("not a armstrong");
               Scanner scan=new Scanner(System.in);
               int s=scan.nextInt();
               int t=scan.nextInt();
               ArmstrongRange armObject = new ArmstrongRange();
              armObject.armstrongrange(s,t);
	}

}
