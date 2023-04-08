package com.feuji.feb23rd;

import java.util.concurrent.Callable;


interface School{
	void read();
}

public class Demo {

	public static void main(String[] args) {
        System.out.println("runn" +Thread.currentThread().getName());				

        new Thread(new Runnable() {
			
			@Override
			public void run() {
            System.out.println("runn" +Thread.currentThread().getName());				
			}
		}).start();
        
        new Thread(()->System.out.println("runn" +Thread.currentThread().getName())).run();
        new Thread(()->System.out.println("runn" +Thread.currentThread().getName())).start();
	
	
	
	}

}
