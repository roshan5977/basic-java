package com.feuji.tests;

import java.util.*;

public class FeujiTests01 {

	public static void main(String[] args) {
    int x[]= {2,3,4,5,5,5,5,6,7,7,8,9};
    int y[]= {3,6,8,2,7,3,0};
    int z[]= {5,8,2,7,3,9,3,4};
//    System.out.println(search(x,9));
   
    //sum(x,y);
  //  printArr(mergeThreeArray(x,y,z));
//    System.out.println(sumOfTwoArr(x,y));
 //   System.out.println(LargestNumArr(y));
//    removeOddNumArr(x);
    
	}
	public static void printArr(int []a) {
		for(int x:a)System.out.print(x+" ");
		System.out.println();
		
	}
	public static int  search(int []a,int index) {
		int i=0,j=a.length;
		while(i<=j) {
			int mid=(i+j)/2;
			if(a[mid]==index)return mid;
			else if (index<a[mid])j=mid-1;
			else i=mid+1;
		}
		return 0;	
	}

	public static int[] mergeThreeArray(int[] a, int[] b, int[] c) {
		int i = 0, j = 0, k = 0, l = 0;
		int d[] = new int[a.length + b.length+c.length];
		while (i < a.length)
			d[l++] = a[i++];
		while (j < b.length)
			d[l++] = b[j++];
		while (k < c.length)
			d[l++] = c[k++];
		return d;
	}
	public  static void sum(int[] a, int[] b) {
	 Queue q=new LinkedList<>();
	 int i=0,j=0,sum=0;
	 while(i<a.length)
	 q.add(a[i++]);
	 while(j<b.length)
		 q.add(b[j++]);
	  while(!q.isEmpty())sum+=(Integer)q.poll();
	  System.out.println(sum);
	}

	public static int sumOfTwoArr(int[] a, int[] b) {
		int i = 0, j = 0, sum = 0;
		while (i < a.length)
			sum += a[i++];
		while (j < b.length)
			sum += b[j++];
		return sum;
	}

	public static int LargestNumArr(int[] a) {
		int res = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > res)
				res = a[i];
		}
		return res;
	}

	public static int sumOfTwoNum(int a, int b) {
		return a + b;

	}
	public static void removeOddNumArr(int a[]) {
		List<Integer> l=new ArrayList<>();
		for (int i = 0; i < a.length; i++) 
			if(a[i]%2==0)l.add(a[i]);
		
		System.out.println(l);
	}
//	public static  void swap(int firstNum,int secondNum) {
//		firstNum=secondNum+firstNum;
//		secondNum=firstNum-secondNum;
//		firstNum=firstNum-secondNum;
//		System.out.println("firstnum is"+firstNum+"secondnum"+secondNum);
//	}
}
