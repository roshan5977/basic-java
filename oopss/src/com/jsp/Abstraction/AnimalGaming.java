package com.jsp.Abstraction;
/*
class Animal
{
    public void sound()
    {
    	
    }
    public void movement()
    {
    	
    }
    public void drink()
    {
    	System.out.println("drinks water");
    }
}
class Tiger extends Animal
{
	public void sound()
    {
    	System.out.println("lion roars");
    }
    public void movement()
    {
    	System.out.println("lion walks ");
    }
    public void eats()
    {
    	System.out.println("lions hunts and eat");
    }
}
class Snake extends Animal
{
	public void sound()
    {
    	System.out.println("snake hisssssssssscsss");
    }
    public void movement()
    {
    	System.out.println("snake crawls");
    }
    public void venomUse()
    {
    	System.out.println("snake venom is a medicine ");
    }
	
}
public class AnimalGaming {

	public static void main(String[] args) {

		Tiger t=new Tiger();
		t.drink();
		t.eats();
		t.sound();
		t.movement();
		System.out.println("************************");
		//upcasting
     Animal tiger=new Tiger();
	    tiger.drink();
	   //tiger.eats();specific method of child clss
		tiger.sound();
		tiger.movement();
		System.out.println("************************");
		Tiger ti= (Tiger)tiger;
		ti.eats();
	}
}
*/
 interface Animal
{
	 abstract public void movements();
	abstract public void sound();
	public default void drinks() {
		System.out.println("ahhh water");
	}
}
class Dog implements Animal
{
	@Override
	public void movements()
	{
		System.out.println("dog runs");
	}
	public void sleeps()   //specific or concrete method
	{
		System.out.println("dog sleeps too less");
	}
	@Override
	public void sound()//have implementataion
	{
		System.out.println("dog barks");
	}
}
class Cat implements Animal
{
	@Override
	public void movements() {
		System.out.println("runs too fast");
	}
	@Override
	public void sound() {
		System.out.println("its sounds like meow");
	}
	public void eats()
	{
		System.out.println("eats cat");
	}
}
class Tiger implements Animal
{
	public void movements() {
		System.out.println("lion walks");
	}
	public void sound()
	{
		System.out.println("lion roars");
	}
	public void designationInForest()
	{
		System.out.println("king of jungle");
	}
}
public class AnimalGaming
{

	public static void main(String[] args) {
		Animal a=new Dog();//up casting
		a.drinks();//specific method of parent class 
		a.movements();//overridden methods of child class
		a.sound();
		//Achieving abstraction by up casting implementation hidden but only shown functionality
		Dog d=(Dog)a;//down casting
		d.sleeps();//specific method of child class which i can't with up casting
	}
}

























