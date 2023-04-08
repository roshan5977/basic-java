package com.jsp.unsolves;

public class RemoveDuplicateArray {

	public static void main(String[] args) {
		int []a= {8,2,4,9,8,0,2,0,5,6};
		print(removeDuplicate(a));
	}
	public static void print(int []a) {
		for(int x:a)System.out.print(x+" ");
	}
	public static int[] removeDuplicate(int []a) {	
		int ti=0;
		for(int i=0;i<a.length;i++) {
			int count=0;
		for(int j=0;j<a.length;j++)
		{
			if(a[i]==a[j])count++;
		}
		if(count==1)ti++;
		}
		int []t=new int[ti];
		for(int i=0,s=0;i<a.length;i++,s++) {
			int count=0;
		for(int j=0;j<a.length;j++)
		{
			if(a[i]==a[j])count++;
		}
		if(count==1)t[s]=a[i];
		}
		return t;
	}
	public static int[] printDuplicate() {	
		
	}


}
