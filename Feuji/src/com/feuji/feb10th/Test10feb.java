package com.feuji.feb10th;

import java.io.FileNotFoundException;

public class Test10feb {

	public static void main(String[] args) throws Exception  {
		Bike h=new Honda();
		try {
			h.ride();
			h.countBike();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
