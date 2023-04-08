package com.feuji.feb21;

public class Runthread implements Runnable {

	Print1to100 printit;

	Runthread(Print1to100 printit) {
		this.printit = printit;
	}

	@Override
	public void run() {
		printit.printing1to100();
	}

}
