package com.feuji.feb13;

public interface Account {
	void checkBalance () ;

	void deposit( double amt);

	void withdraw(double amt) throws Exception;
}
