package com.feuji.feb10th;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Honda implements Bike{

	@Override
	public void ride() {
		System.out.println("riding bike");
	}

	@Override
	public void countBike() throws IOException {
		FileInputStream fis=new FileInputStream("honda.txt");
		try {
	          while(fis.read()!=-1) {
			System.out.print((char)fis.read());
	          }
		} catch (IOException e) {
			
			System.out.println(e.getMessage());
			e.printStackTrace();
			throw new IOException("io exception handled");
		}
	}

}
