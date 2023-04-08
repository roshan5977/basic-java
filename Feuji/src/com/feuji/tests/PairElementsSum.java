package com.feuji.tests;

import java.util.ArrayList;
import java.util.Iterator;

public class PairElementsSum {

	public static void main(String[] args) {
		int a[]= {2,4,6,8,2,2,5,6,4,6,0,7,3,2,1};
		
          print(pairsum(5,a));
	}
	public static void print(ArrayList a) {
		Iterator i=a.iterator();
		while (i.hasNext()) {
			for(int t=0;t<2;t++) {
				  int []s=(int[])i.next();
				  for(int f=0;f<s.length;f++) {
					  System.out.println(s[f]);
				  }
			}
	    
		}
	}
	public static ArrayList pairsum(int sum,int[] arr) {
		ArrayList s=new ArrayList();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]+arr[i+1]==sum)s.add(new int[]  {arr[i],arr[i+1]}); 
			}
		}
		return s;
	}

}
