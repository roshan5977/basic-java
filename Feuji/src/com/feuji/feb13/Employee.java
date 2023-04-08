package com.feuji.feb13;

public class Employee {
String name;
int empid;
boolean maried;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public boolean isMaried() {
	return maried;
}

public void setMaried(boolean maried) {
	this.maried = maried;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", empid=" + empid + ", maried=" + maried + "]";
}


}
