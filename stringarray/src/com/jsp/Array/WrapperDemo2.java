package com.jsp.Array;

public class WrapperDemo2 {
	public static void main(String[] args) {
		Object []a=new Object [5];
		name(a);
	}
	public static void name(Object[]o) {
		int sum=0;
		o[0]="HELLO";
		o[1]='R';
		o[2]=22;
		o[3]=3.6;
		o[4]=true;
		for(Object x:o)
		{
			if(x instanceof Number) sum=sum+(int) x;
			if(x instanceof String)System.out.println(x+"string");
		}
	}

}
