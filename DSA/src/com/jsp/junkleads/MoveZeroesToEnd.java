package com.jsp.junkleads;

public class MoveZeroesToEnd {

	public static void main(String[] args) {
		int []a= {8,0,2,0,4,5,0,1,5,0,0,3,0};
		moveZeroesToEnd(a);
		print(a);
	}
	static void  print(int a[])
	{
		for(int x:a)System.out.print(x+" ");
	}
	public static void moveZeroesToEnd(int []a)
	{ 
		//int b[]=new int[a.length];
		int j=a.length-1;
		for(int i=0;i<a.length-1;i++)
		{
			
			while(a[j]==0) j--;
			if(a[i]==0) {
				int tem=a[j];
				a[j]=a[i];
				a[i]=tem;
			}
		}
	}

}
