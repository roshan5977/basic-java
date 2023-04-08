package com.feuji.feb21;

public class ThreadDemo3 {

	public static void main(String[] args) {

		System.out.println("main thread starts " + Thread.currentThread().getName());
		System.out.println("main thread starts " + Thread.currentThread().getPriority());
		Thread.currentThread().setName("Roshan");
		System.out.println("main thread starts " + Thread.currentThread().getName());
		Thread t1 = new MyThreadPrint1to100();
		t1.start();

	}

}

class MyThreadPrint1to100 extends Thread {

	@Override
	public void run() {
		print1to100();
		printAtoZ();
	}

	public void print1to100() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+":::"+i);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		}
	public void printAtoZ() {
		for(char c='A';c<='Z';c++) {
			System.out.println(Thread.currentThread().getName()+":::"+c);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
			}
}
