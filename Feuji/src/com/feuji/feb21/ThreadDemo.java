package com.feuji.feb21;

public class ThreadDemo {
//thread priority-thread lifecycle -syncronised
	public static void main(String[] args) {
//		Thread
		//Vector
		Runnable  r=new Runnable() {
			@Override
			public void run() {
        System.out.println("gyg");				
			}
		};
		r.run();
	}
	   void m2() {
		  //synchronized block
		   synchronized(this){
			   System.out.println("jr");
		   }
		   System.out.println("nfj");
	}
	}
