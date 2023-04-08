package com.jsp.Array;

public class WrapperDemo1 
{
	public static void main(String[] args) {
          Integer i=10;
       int z= Integer.decode("8")*6;
       System.out.println(z);
      System.out.println( Integer.BYTES);//4bytes//its a DM final
      System.out.println(Integer.MAX_VALUE);//it gives range of integer //dm
      System.out.println(Integer.SIZE);//32
      System.out.println(Integer.bitCount(1000000000));//2bit-10//13 bit
      System.out.println(Integer.compare(20, 3));//1 //0//-1
      System.out.println(Integer.max(5, 4));//5
      System.out.println(Integer.remainderUnsigned(50, 3));//remainder
      System.out.println(Integer.sum(2, 5));
      System.out.println(Integer.valueOf(""));
      System.out.println(Integer.valueOf(5));
	}

}


	
