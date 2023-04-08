package com.jsp.stringprogram;

import java.util.Scanner;

public class DecodingCoding {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE STRING U WANT ME TO DECODE!!!!");
      String s=sc.next(),s1="";
      System.out.println("ENTER THE LEVEL OF DECODING: ");
      int dcdLvl=sc.nextInt();
      while(dcdLvl>=26) dcdLvl-=26;  
      char [] a=s.toCharArray();
      for(char t:a)
      {   
    	  if(t>='a'&&t<='z')
    	  {
    	  int f=(int)t+dcdLvl;
    	  if(f>122) f=96+(f-122);
    	 s1+=(char)f;
    	  }
    	  else if(t>='A'&&t<='Z')
    	  {
    	  int f=(int)t+dcdLvl;
          if(f>90)f=90+(f-65);    	  
    	 s1+=(char)f;
    	  }
      }
      System.out.println(s1);
	}
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("ENTER THE STRING U WANT ME TO DECODE!!!!");
//      String s=sc.next(),s1="";
//      System.out.println("ENTER THE LEVEL OF DECODING: ");
//      int dcdLvl=sc.nextInt();
//      char[] a=s.toCharArray();
//       for(char x:a)
//       {
//    	   int count=0;
//    	   for(char i=x;i<='z'||i<='Z';)
//    	   {
//    		   if(dcdLvl==count)
//    		   {
//    			   s1+=i;
//    			   break;
//    		   }
//    		   count++;
//    		if(i=='z')i='a';
//    		else if(i=='Z')i='A';
//    		else i++;
//    	   }
//       }
//       System.out.println(s1);
//	}
}
