package com.jsp.comparable;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//import java.util.ArrayList;
import com.jsp.ArrayList.*;

public class Requitment implements Comparable<Requitment> {
	String companyName;
	String employeeName;
	String designation;
	double sal;
	long companyid;

	public Requitment(String companyName, String employeeName, String designation, double sal, long companyid) {
		this.companyid = companyid;
		this.companyName = companyName;
		this.designation = designation;
		this.employeeName = employeeName;
		this.sal = sal;
	}

	public Requitment() {

	}

	@Override
	public String toString() {
		return companyid + ":" + companyName + ":" + employeeName + ":" + designation + ":" + sal;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public long getCompanyid() {
		return companyid;
	}

	public void setCompanyid(long companyid) {
		this.companyid = companyid;
	}

	public static void main(String[] args) {
		// ArrayList<Requitment> list= new ArrayList<Requitment>();
		ArrayList<Requitment> list = new ArrayList<Requitment>();
		list.add(new Requitment("JSPIDERS", "ROSHAN", "SDE", 20000.0, 8249));
		list.add(new Requitment("PANKAJSIR", "PRIYANKA", "SE", 2000.0, 2056));
		list.add(new Requitment("TELUSKA", "MEGHA", "TE", 10000.0, 4567));
		list.add(new Requitment("JSPIDERS", "SONALI", "JDE", 2500.0, 3087));
		list.add(new Requitment("xyz", "Mia", "SDE", 20000.0, 8249));
		list.add(new Requitment("arunSIR", "supria", "SE", 2000.0, 2056));
		list.add(new Requitment("ryter", "sunny", "TE", 10000.0, 4567));
		list.add(new Requitment("JSPIDERS", "SIMRAN", "JAVA DEVELOPER", 2000000.0, 6567));
		// Iterating over entries to print them
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i)); 
		Collections.sort(list,new GetDataByCompanyName() );
	}

	@Override
	public int compareTo(Requitment r)// natural ordering
	{
		return (int) (this.companyid - r.companyid);
	}
     
	
	

}

class GetDataByCompanyName implements Comparator<Requitment> {
	@Override
	public int compare(Requitment r1, Requitment r2) {
		return r1.companyName.compareTo(r2.companyName);
	}
}

class GetDataByEmployeeName implements Comparator<Requitment> {
	@Override
	public int compare(Requitment r1, Requitment r2) {
		return r1.employeeName.compareTo(r2.employeeName);
	}
}

class GetDataBySalary implements Comparator<Requitment> {
	public int compare(Requitment r1, Requitment r2) {
		if (r1.sal > r2.sal)
			return 1;
		if (r1.sal < r2.sal)
			return -1;
		return 0;
	}
}

class GetDataByCompanyid implements Comparator<Requitment> {
	@Override
	public int compare(Requitment r1, Requitment r2) {
		return (int) (r1.companyid - r2.companyid);
	}
}
