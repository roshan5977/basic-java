package com.jsp.Array;

public class CS_PairSum {

	public static void main(String[] args) {
		int []s= {1,2,3,4,5};
		int [][]y=pairSum(s,5);
				for(int []x:y)
			for(int f:x)System.out.print(f+" ");
	}

	public static int[][] pairSum(int[] arr, int s) {
		int [][]k=new int [1][2];
	        for(int i=0;i<arr.length-1;i++){
	            for(int j=i+1;j<arr.length;j++){
	                if(arr[i]+arr[j]==s) {
	                    if(arr[i]<=arr[j]) {k[0][0]=arr[i];
	                    k[0][1]=arr[j];}
	                    else{
	                    	k[0][1]=arr[i];
	                    	k[0][0]=arr[j];}
	                }
	            }
	        }
	        return k;
	 }

}
