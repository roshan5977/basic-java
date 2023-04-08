package com.jsp.exception;

//creating checked exception so that handling it will be compulsory
class InsufficientBal extends Exception {
	public InsufficientBal() {
		super("low balance");
	}

	public InsufficientBal(String s) {
		super(s);
	}
}

public class Account {
	private int bal;

	public Account(int b) {
		bal=b;
	}

	public int getBal() {
		return bal;
	}

	public void withdraw(int amt) throws InsufficientBal {
		// we can write simple msg bt to make it their own custom msg
		// instead of default msg they can provide so creating exception
		if (bal < amt)
			throw new InsufficientBal();
		// to handle this checked exception i will use throws so that who will use it
		// will hanlde
		// currency dispatch
		bal -= amt;
	}

}
