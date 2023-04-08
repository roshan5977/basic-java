package com.feuji.feb22;

import java.time.LocalDate;

public class Employe {

	public LocalDate getLd() {
		return Ld;
	}

	public void setLd(LocalDate ld) {
		Ld = ld;
	}

	private int id;
	private String ename;
	private boolean status;
	private LocalDate Ld;


	public Employe(int id, String ename, boolean status,LocalDate Ld) {
		super();
		this.id = id;
		this.ename = ename;
		this.status = status;
		this.Ld=Ld;
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
