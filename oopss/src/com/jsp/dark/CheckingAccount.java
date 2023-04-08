package com.jsp.dark;

public class CheckingAccount {

//non static private dm
     private String name;
	 private long id;
     private long balance;
     //public String name;
    // public String id;
     //public int balance;
     
 //argumented constructor initialise the non static dm
     public CheckingAccount(String name,long id,long balance)
     {
    	this.name=name;
    	this.id=id;
    	this.balance=balance;
     }
     public void addFunds(long fundsToAdd )
     {
    	 balance+=fundsToAdd;
    	 
     }
     public void withdrawAmount(long amount)
     {
    	 balance-=amount;
     }
     public void display()
     {
    	 System.out.println("the account holder name is "+name+"have balance currently "+balance);
     }
    
}
