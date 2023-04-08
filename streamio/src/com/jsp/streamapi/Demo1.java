package com.jsp.streamapi;

import java.io.*;

public class Demo1 {

	public static void main(String[] args) throws FileNotFoundException,IOException {
    FileInputStream fis=new FileInputStream("wow.txt");
    int data;
    while((data=fis.read())!=-1)System.out.print((char)data);
    fis.close();
	}

}
