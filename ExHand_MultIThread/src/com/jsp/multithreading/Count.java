package com.jsp.multithreading;

public class Count {

	public static void main(String[] args) {
		System.out.println(count(767));
	}
	public static int count(int num) {
		int counting=0;
		for(int i=1;num>0;i++,num/=10)counting++;
		return counting;
	}

}
