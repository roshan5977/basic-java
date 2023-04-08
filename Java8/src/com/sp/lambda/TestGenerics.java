package com.sp.lambda;

public class TestGenerics {
	interface MotorBikeA<T> 
	{
//		cant give generic type in dm of interface
		int a=66;
		 T mBikeRide(T a);
	}
	public static void main(String[] args) {
		MotorBikeA<String> mba=(a)->a+":doing party";
		
	     System.out.println(mba.mBikeRide("Roshan"));

	}

}
