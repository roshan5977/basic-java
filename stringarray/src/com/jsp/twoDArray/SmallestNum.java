package com.jsp.twoDArray;

public class SmallestNum {

	public static void main(String[] args) {
      int[][]a= {
    		  {6,8,2},
    		  {9,3,7},
    		  {5,1,2}
      };
      int small=a[0][0];
      int large=a[0][0];
      for(int []x:a)
      {
    	  for(int v:x)
    	  {
    		  if(v<small)small=v;
    		  if(v>large)large=v;
    	  }
      }
      System.out.println("THE SMALLEST NUM IS : " +small+" \n"
      		+ "THE LARGEST NUM IS : "+large);
	}

}
