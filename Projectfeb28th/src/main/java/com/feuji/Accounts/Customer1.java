package com.feuji.Accounts;

public class Customer1 {
	private int CustomerId;
	private String CustomerName;
	private int CutomerPhno;
	private String CustomerCity;
	
	public Customer1(int customerId, String customerName, int cutomerPhno, String customerCity) {
		super();
		CustomerId = customerId;
		CustomerName = customerName;
		CutomerPhno = cutomerPhno;
		CustomerCity = customerCity;
	}
	@Override
	public String toString() {
		return "Customer [CustomerId=" + CustomerId + ", CustomerName=" + CustomerName + ", CutomerPhno=" + CutomerPhno
				+ ", CustomerCity=" + CustomerCity + "]";
	}
	public int getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public int getCutomerPhno() {
		return CutomerPhno;
	}
	public void setCutomerPhno(int cutomerPhno) {
		CutomerPhno = cutomerPhno;
	}
	public String getCustomerCity() {
		return CustomerCity;
	}
	public void setCustomerCity(String customerCity) {
		CustomerCity = customerCity;
	}
	

}
