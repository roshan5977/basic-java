package com.jsp.unsolves;

public class ThirdLargestInArray {

	public static void main(String[] args) {
     int a[]= {8,2,4,9,8,0,2,0,5,6};
     System.out.println(thirdLargestInArray(a));
	}
	public static int thirdLargestInArray(int []a) {
		int first=a[0];
		int sec=a[0];
		int third=a[0];
		for(int i=0;i<a.length;i++)
		{
			while(a[i]>first) 
			{
				third=sec;
				sec=first;
				first=a[i];
			}
			while((a[i]>sec&&a[i]!=first)||) 
			{
				third=sec;
                 sec=a[i];				
			}
			while((a[i]>third||first==sec)&&a[i]!=first&&a[i]!=sec) 
			{
				third=a[i];
			}
		}
		return third;
	}

}
