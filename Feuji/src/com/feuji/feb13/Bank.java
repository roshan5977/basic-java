package com.feuji.feb13;

class LowBalance extends Exception {
	public LowBalance(String s) {
		super(s);
	}
}

class Money100multiple extends Exception {

	public Money100multiple(String message) {
		super(message);
	}

}

public class Bank implements Account {
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public void checkBalance() {
		System.out.println("ur current balance is " + getBalance());
	}

	@Override
	public void deposit(double amt) {
		balance += amt;
		System.out.println(amt + " deposited successfully");
	}

	@Override
	public void withdraw(double amt) throws Exception {
		if (amt > getBalance())
			throw new LowBalance("ur account balance is low");
		if (balance % 100 != 0)
			throw new Money100multiple("enter only multiple of 100");
		if (balance < 500)
			throw new LowBalance("it should be greater than 500 ");
		balance -= amt;
		System.out.println(amt + " withdrawn successfully");

	}

}
