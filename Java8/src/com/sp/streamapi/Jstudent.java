package com.sp.streamapi;

import java.util.List;
import java.util.Scanner;

public class Jstudent {
	private String jname;
	private int jid;
	private String cour;

	public String getJname() {
		return jname;
	}

	public void setJname(String jname) {
		this.jname = jname;
	}

	@Override
	public String toString() {
		return "Jstudent [jname=" + jname + ", jid=" + jid + ", cour=" + cour + "]";
	}

	public Jstudent(String jname, int jid, String cour) {
		super();
		this.jname = jname;
		this.jid = jid;
		this.cour = cour;
	}

	public int getJid() {
		return jid;
	}

	public void setJid(int jid) {
		this.jid = jid;
	}

	public String getCour() {
		return cour;
	}

	public void setCour(String cour) {
		this.cour = cour;
	}

	public static void main(String[] args) {
		List<Jstudent> jlist=List.of(new Jstudent("simran",47,"j2ee"),new Jstudent("sunny",82,"angular"),new Jstudent("rany",48,"sql"),new Jstudent("rashmi",65,"python"),new Jstudent("prabhu",75,"c++"),new Jstudent("rahim",85,"java"));
		
     System.out.println("welcome !!! \n"
     		+ "choose from bellow option \n"
     		+ "1.order according to alphabet name \n"
     		+ "2.order by course alphabet name \n"
     		+ "3.order by id");
    Scanner sc= new Scanner(System.in);
    int key=sc.nextInt();
     switch (key) {
	case 1:
		List<Jstudent> l1=jlist.stream().
		break;
case 2:
		
		break;
case 3:
	
	break;

	default:System.out.println("press an valid input");
		break;
	}
	}
	public static void print() {
		
	}

}
