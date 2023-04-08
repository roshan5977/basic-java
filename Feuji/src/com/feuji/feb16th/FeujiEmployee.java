package com.feuji.feb16th;

public class FeujiEmployee implements Comparable<FeujiEmployee>  {

	private String name;
	private int id;
	private String Specialisation;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSpecialisation() {
		return Specialisation;
	}
	public void setSpecialisation(String specialisation) {
		Specialisation = specialisation;
	}
	@Override
	public String toString() {
		return "FeujiEmployee [name=" + name + ", id=" + id + ", Specialisation=" + Specialisation + "]";
	}
	public FeujiEmployee(String name, int id, String specialisation) {
		super();
		this.name = name;
		this.id = id;
		Specialisation = specialisation;
	}
	@Override
	public int compareTo(FeujiEmployee o) {
		return this.name.compareTo(o.name);
	}
	
	
	
	
}
