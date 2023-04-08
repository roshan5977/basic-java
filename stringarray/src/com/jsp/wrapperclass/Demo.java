package com.jsp.wrapperclass;

public class Demo
{

	public static void main(String[] args) {
		Car[] c = new Car[4];
		c[0] = new Ferari();
		c[1] = new Lamborgini();
		c[2] = new Ferari();
		c[3] = new Lamborgini();
		for (Car t : c) {
			System.out.println(t);
		}
		for (Car x : c) {
			if (x instanceof Wrapper)
				((Ferari) x).bluetooth();
			if (x instanceof Lamborgini)
				((Lamborgini) x).sunroof();
		}
	}
}
interface Car {
	public void door();
	public void speed();
	
}

class Ferari implements Car {
	@Override
	public void door() {
		System.out.println("ferari opening back slide");
	}

	@Override
	public void speed() {
		System.out.println("300 km/hr ferari");
    }
	public void bluetooth() {
		System.out.println("mega dum dum bluetooth of ferrai");
	}
}

class Lamborgini implements Car {
	@Override
	public void door() {
		System.out.println("Lamborgini door in air");
	}

	@Override
	public void speed() {
		System.out.println("500 km/hr bullet speed lamborgini");
	}

	public void sunroof() {
		System.out.println("total upen curve roof of lamborgini");
	}
}