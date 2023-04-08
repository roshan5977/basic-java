package com.jsp.developerdesignforcar;

public class Driver {

	public void drive(Car car)
	{
		car.start();
		car.accelerate();
		car.stop();
	}
	public void accessBluetooth(Car car)
	{
		//downcast needed
	   //  ((Swift)car).Bluetooth();//class cast Exception
	        
		//depends on which object u r passing accordingly it will downcast!!!
	     if (car instanceof Audi) 
	     ((Audi)car).Bluetooth();
	     
	     if (car instanceof Swift) 
		     ((Swift)car).Bluetooth();
 
	}
	
	/*public void drive(Swift swift)
	{
		swift.start();
		swift.accelerate();
		swift.stop();
	}
	
	public void drive(Audi audi)
	{
		audi.start();
		audi.accelerate();
		audi.stop();
	}
	
	public void drive(Benz benz)
	{
		benz.start();
		benz.accelerate();
		benz.stop();
	}
	*/
}
