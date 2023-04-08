package com.feuji.bankApplication;

public  class Account  {
	private int Amount=0;
	 int loanAmount=0;
     public void loans(Bank b) {
    	System.out.println("u need to pay "+(loanAmount+(int)(loanAmount*b.rateOfInterest()))+" after 1 yr ");
    }
    
      void  deposit( int amt) {
    		 Amount+=amt;
    	 System.out.println(amt+ "deposited successfully");
    
     }
      void withdraw(int amt) {
     	 Amount-=amt;

    	 System.out.println(amt+"withdrawn successfully");
     }
     
      public void balanceEnquiry() {
		System.out.println("Remaining balance is "+Amount);
	}
	
	
}
