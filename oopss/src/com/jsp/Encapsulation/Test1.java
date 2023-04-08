package com.jsp.Encapsulation;

class A
{
	private int i; //private data member

    public int getI()
    {
    	return i;
    }
    public void setI(int i)
    {
    	this.i=i;
    }
    
    
}
public class Test1 {

	public static void main(String[] args) {
        A a1 = new A();
 //a1.i;//object cant access the private dm directly.
//to use that private dm we need to use our functionality
//which is nothing bt the public methods
//according to company standards we use 1 method for a  
//single functionality we need to use.
//so we use getter and setter;
        System.out.println(a1.getI()); //0
        a1.setI(20);
        System.out.println(a1.getI());//20

	}

}
