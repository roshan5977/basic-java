package com.feuji.feb22;

import java.time.LocalDate;

public class Employee {

	private int id;
	private String ename;
	private boolean status;


	public Employee(int id, String ename, boolean status) {
		super();
		this.id = id;
		this.ename = ename;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", status=" + status + "]";
	}

}
