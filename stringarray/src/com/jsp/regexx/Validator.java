package com.jsp.regexx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

	public static void main(String[] args) {
		System.out.println("ENTER THE PASS U WANNA VALIDATE");
		Scanner sc = new Scanner(System.in);
		String passEnter = sc.next();
		System.out.println(passwordValidate(passEnter));
		System.out.println("ENTER THE EMAIL U WANNA VALIDATE");
		String emailval = sc.next();
		System.out.println(emailValidate(emailval));
		System.out.println("ENTER THE MOBNUM U WANNA VALIDATE");
		String mobnumval = sc.next();
		System.out.println(mobileNumValidate(mobnumval));
		sc.close();
	}

	public static boolean passwordValidate(String password) {
		Pattern p = Pattern.compile("(?=.*[@])(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{6,10}");
		Matcher m = p.matcher(password);
		return m.matches();
	}

	public static boolean emailValidate(String email) {
		Pattern p = Pattern.compile("[a-z A-Z 0-9]{5,}[@][A-Z a-z]{0,}[.]");
		Matcher m = p.matcher(email);
		return m.matches();
	}

	public static boolean mobileNumValidate(String mobileNum) {
		Pattern p = Pattern.compile("[6-9][0-9]{9}");
		Matcher m = p.matcher(mobileNum);
		return m.matches();
	}

}
