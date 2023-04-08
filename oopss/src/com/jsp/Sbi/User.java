package com.jsp.Sbi;

public class User {

	private String userone;
	private String contactnum;
	Account a3;
	
	public void setUserone(String userone) {
		this.userone = userone;
	}
	public void setContactnum(String contactnum) {
		this.contactnum = contactnum;
	}
    User(String userone,String contactnum,Account a3)
    {
    	this.userone=userone;
    	this.contactnum=contactnum;
    	this.a3=a3;
    }
	 
	
	
}
