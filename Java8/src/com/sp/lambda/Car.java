package com.sp.lambda;

public class Car implements Comparable<Car> {
	String brand;
	int no;
  double price;
public Car(String brand, int no, double price) {
	super();
	this.brand = brand;
	this.no = no;
	this.price = price;
}
@Override
public String toString()
{
	return "["+brand+","+no+","+price+"]";
}
@Override
public int compareTo(Car o1) {
	return (int) (this.no-o1.no);
}

}
