package com.free.practice;

import java.util.Scanner;

class Sim {
	String color;
	long number;
	String serviceprovider;
	String networkspeed;

	public void display() {
		System.out.println("color of the sim is " + this.color);
		System.out.println("number of sim is " + this.number);
		System.out.println("network sim for the sim is " + this.networkspeed);
		System.out.println("service provider is " + this.serviceprovider);
	}
}

class Airtel extends Sim {
	public void airtel() {
		this.color = "BLUE";
		this.number = 933792899;
		this.serviceprovider = "AIRTEL";
		this.networkspeed = "500 MBPS";
	}
}

class Jio extends Sim {
	public void jio() {
		this.color = "RED";
		this.number = 824980205;
		this.serviceprovider = "jio";
		this.networkspeed = "200 MBPS";
	}
}

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Airtel a = new Airtel();
		Jio j = new Jio();
		while (true) {
			System.out.println("WELCOME TO DARK SIM WORLD");
			System.out.println("HLO BOSS DO U WANNA USE SIM OR  U WANNA EXIT  ");
			System.out.println("PRESS 1 FOR USING SIM AND 2 FOR EXIT");
			int press = sc.nextInt();
			if (press == 1) {
				System.out.println("WELCOME BOSS WHICH SIM U WANNA USE PLEASE CHOOSE");
				System.out.println("PRESS 1 FOR SIM 1 AND 2 FOR SIM 2");
				int pres = sc.nextInt();
				if (pres == 1) {
					j.jio();
					j.display();
				} else if (pres == 2) {
					a.airtel();
					a.display();
				} else {
					System.out.println("invalid number");
				}
			}
			System.out.println("do u wanna continue press 5 for continue ");
			int cont = sc.nextInt();
			if (cont == 5)
				continue;
			else {
				System.out.println("exited successfully");
				return;
			}
		}
	}
}
