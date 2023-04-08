package com.jsp.exceptionHndling;

 class CarAccident extends Exception {

}

class BikeAccident extends RuntimeException {

}

class Ride  {

	public void ridingCar() throws CarAccident {
		System.out.println("riding fast ");
	}

	public void ridingbike() throws BikeAccident {
      System.out.println("riding bike faster.....");
	}

}
class Roshan{

	public static void main(String[] args) {
		Ride r=new Ride();
		try {
			r.ridingCar();
		} catch (CarAccident e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		

}
