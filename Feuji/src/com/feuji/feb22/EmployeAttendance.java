package com.feuji.feb22;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class EmployeAttendance {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		LocalDate date = LocalDate.now();

		ArrayList<Employe> lists0 = new ArrayList<>();
		LocalDate previous0 = date.minusDays(0);
		lists0.add(new Employe(1, "Roshan", true, previous0));
		lists0.add(new Employe(2, "Prakash", true, previous0));
		lists0.add(new Employe(3, "Rashmi", false, previous0));
		lists0.add(new Employe(4, "Binod", true, previous0));
		lists0.add(new Employe(5, "John", true, previous0));

		ArrayList<Employe> lists1 = new ArrayList<>();
		LocalDate previous1 = date.minusDays(1);
		lists1.add(new Employe(1, "Roshan", true, previous1));
		lists1.add(new Employe(2, "Prakash", true, previous1));
		lists1.add(new Employe(3, "Rashmi", false, previous1));
		lists1.add(new Employe(4, "Binod", true, previous1));
		lists1.add(new Employe(5, "John", true, previous1));

		ArrayList<Employe> lists2 = new ArrayList<>();
		LocalDate previous2 = date.minusDays(2);
		lists2.add(new Employe(1, "Roshan", true, previous2));
		lists2.add(new Employe(2, "Prakash", true, previous2));
		lists2.add(new Employe(3, "Rashmi", false, previous2));
		lists2.add(new Employe(4, "Binod", true, previous2));
		lists2.add(new Employe(5, "John", true, previous2));

		ArrayList<Employe> lists3 = new ArrayList<>();
		LocalDate previous3 = date.minusDays(3);
		lists3.add(new Employe(1, "Roshan", true, previous3));
		lists3.add(new Employe(2, "Prakash", true, previous3));
		lists3.add(new Employe(3, "Rashmi", false, previous3));
		lists3.add(new Employe(4, "Binod", true, previous3));
		lists3.add(new Employe(5, "John", true, previous3));

		ArrayList<Employe> lists4 = new ArrayList<>();
		LocalDate previous4 = date.minusDays(4);
		lists4.add(new Employe(1, "Roshan", true, previous4));
		lists4.add(new Employe(2, "Prakash", true, previous4));
		lists4.add(new Employe(3, "Rashmi", false, previous4));
		lists4.add(new Employe(4, "Binod", true, previous4));
		lists4.add(new Employe(5, "John", true, previous4));

		Map<LocalDate, ArrayList<Employe>> attendance = new TreeMap();
		attendance.put(lists0.get(0).getLd(), lists0);
		attendance.put(lists1.get(0).getLd(), lists1);
		attendance.put(lists2.get(0).getLd(), lists2);
		attendance.put(lists3.get(0).getLd(), lists3);
		attendance.put(lists4.get(0).getLd(), lists4);

		System.out.println("Total Employees are 5");
		System.out.println("Enter the date on which u want to enter in format year-month-date \n" 
		+ "Example 2023-02-19 ");
		String dt = sc.next();
		LocalDate ld = LocalDate.parse(dt);
		int count0 = 0;
		for (Iterator<Employe> a0 = attendance.get(ld).iterator(); a0.hasNext();)
			if (a0.next().isStatus())
				count0++;
		System.out.println("attendance of " + ld + " is=" + count0 + " and absent is " + (5 - count0));
	}
}