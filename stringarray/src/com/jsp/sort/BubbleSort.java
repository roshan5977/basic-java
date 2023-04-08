package com.jsp.sort;

public class BubbleSort {
	
	public static void main(String[] args) {
        int [] a= {6,1,9,3,7,4,5,7,9,2,8};
      sort(a);
       	}
	public static void sort(int a[])
	{
		 for(int j=0;j<a.length-1;j++) {
		        for(int i=0;i<a.length-1-j;i++) {
		        if(a[i]>a[i+1])
		        {
		        	int temp=a[i];
		        	a[i]=a[i+1];
		        	a[i+1]=temp;
		        }
		        }
		        }
		 for(int x:a)
		 {
			 System.out.println(x);
		 }

	}
}
