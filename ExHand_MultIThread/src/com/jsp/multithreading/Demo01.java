package com.jsp.multithreading;

public class Demo01 {

	public static void main(String[] args) {
	   
		
	Thread m1=new Thread(new MyRunnable(),"m1");
	Thread m2=new Thread(new MyRunnable(),"m2");
	Thread m3=new Thread(new MyRunnable(),"m3");
	
	m1.start();
	try {
		m1.join(5000);
		System.out.println(1);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	m2.start();
	try {
		m1.join();
		System.out.println(2);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	m3.start();
		try {
			m1.join();
			System.out.println(31);
			m2.join();
			System.out.println(32);
		m3.join();
		System.out.println(32);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		System.out.println("all thread are dead ,exiting main thread");

		

	}

}
class MyRunnable implements Runnable{
	@Override
	public void run() {
		System.out.println("Thread started curr thread: "+Thread.currentThread().getName()+" ");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Thread started curr thread: "+Thread.currentThread().getName()+" ");

		
		
	}
}



//A thread state. A thread can be in one of the following states: •NEW
//A thread that has not yet started is in this state. 
//•RUNNABLE
//A thread executing in the Java virtual machine is in this state. 
//•BLOCKED
//A thread that is blocked waiting for a monitor lockis in this state. 
//•WAITING
//A thread that is waiting indefinitely for another thread toperform a particular action is in this state. 
//•TIMED_WAITING
//A thread that is waiting for another thread to perform an actionfor up to a specified waiting time is in this state. 
//•TERMINATED
//A thread that has exited is in this state. 
//
//A thread can be in only one state at a given point in time.These states are virtual machine states which do not reflectany operating system thread states.

