package com.feuji.feb15th;

public class Guest {

	public static void main(String[] args) {
   Glass<Juice> g=new Glass();
   Juice juice=new Juice();
   g.liquid=juice;
   
   //retrive
   Juice j=(Juice) g.liquid;
	}

}
