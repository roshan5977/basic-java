package com.jsp.collection;

public class Student {
    int age;
    String name;
    Student(int a,String n)
    {
    	age=a;
    	name=n;
    }
    @Override
    public boolean equals(Object obj) {
    	Student s=(Student)obj;
    	Student s1=(Student)this;
        return (s.name.equals(s1.name))&&(s.age==s1.age);    	
    }
    @Override
    public int hashCode()
    {
    	return System.identityHashCode(name);
    }
	public static void main(String[] args) {
     Set s=new Set();
     Student s11=new Student(22,"roshan");
     Student s12=new Student(25,"subham");
     Student s13=new Student(20,"prakash");
    Student s14=new Student(19,"ranjan");
     Student s15=new Student(15,"zumba");
     Student s16=new Student(25,"subham");
     System.out.println(s.add(s11));
     System.out.println(s.add(s12));
     System.out.println(s.add(s13));
     System.out.println(s.add(s14));
     System.out.println(s.add(s15));
     System.out.println(s.add(s16));

     System.out.println(s12.hashCode()+"__"+s16.hashCode());
     System.out.println(s11.hashCode()+"++"+s12.hashCode());
     System.out.println(s13.hashCode()+"++"+s14.hashCode());
     
	}

}
