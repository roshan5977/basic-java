package com.jsp.sort;
public class MergeSort {
	public static void main(String[] args) {
        int[] a= {1,3,5,5,6,7,5,7,4,8,2,9};
        sort(a);
        for(int x:a)System.out.print(x+" ");
	}
	public static void sort(int a[]) {
		if(a.length==1)return;
		int left[]=new int[a.length/2];
		int right[]=new int[a.length-left.length],i,j;
		for(i=0;i<left.length;i++)left[i]=a[i];
		for(j=0;j<right.length;i++,j++)right[j]=a[i];
		sort(left);
      //  for(int x:a)System.out.print("left"+x+" ");
        //System.out.println();
		sort(right);
    //    for(int x:a)System.out.print("right"+x+" ");
  //      System.out.println();
		merge(left,right,a);
	}
	public static void merge(int[]a,int[]b,int[]c) {
		int i=0,j=0,k=0;
	      while(i<a.length&&j<b.length) {
	    	  if(a[i]<b[j])c[k++]=a[i++];
	    	  else c[k++]=b[j++];
	      }
	      while(i<a.length)c[k++]=a[i++];
	      while(j<b.length)c[k++]=b[j++];
	}
}
