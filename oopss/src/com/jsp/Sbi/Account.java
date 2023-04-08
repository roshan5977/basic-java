package com.jsp.Sbi;

public class Account {

	private static long accountNum;
	private String password;
	private static long cif;
    private double balance;
    static long a = 900000000000l, b = 40000000, c = 85000, d = 100;
    static long e = 9000000l, f = 40000, g = 6700, h = 10;
    SBI_BANK s1;
    
    static {
    	accountNum= (++a + ++b + ++c + ++d);
    	accountNum++;
		 cif = (++e + ++f + ++g + ++h);
		cif++;
    }
    public Account(String password,double balance,SBI_BANK s1)
    {
        this.password=password;
    	this.balance=balance;
    	this.s1=s1;
    }
    
	public String getPassword() {
		return password;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public long getAccountNum() {
		return accountNum;
	}
	public long getCif() {
		return cif;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
