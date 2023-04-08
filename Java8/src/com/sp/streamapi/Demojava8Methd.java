package com.sp.streamapi;

interface Test{
	void toTest();
}
public class Demojava8Methd {
       public static void toTesting() {
		System.out.println("testing sucessfull");
	}
       public void toTestingPro()
       {
    	   System.out.println("testing pro sucessfull");
       }
	public static void main(String[] args) {
		TestOne t1=Demojava8Methd::toTesting;
//		Test t=new Testing()::toTestingPro;
//		t.toTest();

	}

}
