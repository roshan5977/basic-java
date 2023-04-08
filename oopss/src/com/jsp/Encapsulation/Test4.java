package com.jsp.Encapsulation;

class A5
{
	private int Sid;
    private String Sname;
    private int age;
    private String gender;
    private String phno;
     
    public int getSid()
    {
    	return Sid;
    }
    public void setSid(int Sid)
    {
    	this.Sid=Sid;
    }
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
    
}



public class Test4 {

	public static void main(String[] args) {
		A5 n1 = new A5();
		System.out.println(n1.getSid());
		System.out.println(n1.getSname());
		System.out.println(n1.getAge());
		System.out.println(n1.getGender());
		System.out.println(n1.getPhno());
		n1.setAge(97);
		n1.setGender("male");
		n1.setPhno("+91 8249802056");
		n1.setSid(9);
		n1.setSname("roshan");
		System.out.println(n1.getSid());
		System.out.println(n1.getSname());
		System.out.println(n1.getAge());
		System.out.println(n1.getGender());
		System.out.println(n1.getPhno());
	}

}
