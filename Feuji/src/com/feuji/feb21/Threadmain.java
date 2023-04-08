package com.feuji.feb21;

public  class Threadmain {
	public static void main(String[] args) {
		
		Thread t1=new Thread(new Runthread(new Print1to100()));
		t1.start();
	}
}
