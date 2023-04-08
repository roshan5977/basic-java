package com.feuji.feb22;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class EmployeeAttendance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LocalDate date = LocalDate.now();
		LocalDate previous0 = date.minusDays(0);
		LocalDate previous1 = date.minusDays(1);
		LocalDate previous2 = date.minusDays(2);
		LocalDate previous3 = date.minusDays(3);
		LocalDate previous4 = date.minusDays(4);

//		    LocalDate tomorrow = yesterday.plusDays(2);

		ArrayList<Employee> lists1 = new ArrayList<>();
		lists1.add(new Employee(1, "Roshan", true));
		lists1.add(new Employee(2, "Prakash", true));
		lists1.add(new Employee(3, "Rashmi", false));
		lists1.add(new Employee(4, "Binod", true));
		lists1.add(new Employee(5, "John", true));

		ArrayList<Employee> lists2 = new ArrayList<>();
		lists2.add(new Employee(1, "Roshan", true));
		lists2.add(new Employee(2, "Prakash", true));
		lists2.add(new Employee(3, "Rashmi", true));
		lists2.add(new Employee(4, "Binod", true));
		lists2.add(new Employee(5, "John", false));

		ArrayList<Employee> lists3 = new ArrayList<>();
		lists3.add(new Employee(1, "Roshan", true));
		lists3.add(new Employee(2, "Prakash", true));
		lists3.add(new Employee(3, "Rashmi", false));
		lists3.add(new Employee(4, "Binod", true));
		lists3.add(new Employee(5, "John", false));

		ArrayList<Employee> lists4 = new ArrayList<>();
		lists4.add(new Employee(1, "Roshan", true));
		lists4.add(new Employee(2, "Prakash", true));
		lists4.add(new Employee(3, "Rashmi", true));
		lists4.add(new Employee(4, "Binod", true));
		lists4.add(new Employee(5, "John", true));

		ArrayList<Employee> lists5 = new ArrayList<>();
		lists5.add(new Employee(1, "Roshan", true));
		lists5.add(new Employee(2, "Prakash", true));
		lists5.add(new Employee(3, "Rashmi", true));
		lists5.add(new Employee(4, "Binod", true));
		lists5.add(new Employee(5, "John", false));

		Map<LocalDate, ArrayList<Employee>> attendance = new TreeMap();
		attendance.put(previous4, lists1);
		attendance.put(previous3, lists2);
		attendance.put(previous2, lists3);
		attendance.put(previous1, lists4);
		attendance.put(previous0, lists5);

		System.out.println("Total Employees are 5");
		System.out.println(
				"Enter the date on which u want to enter in format year-month-date \n" + "Example 2023-02-19 ");
		String dt = sc.next();
		LocalDate ld = LocalDate.parse(dt);
		
		int count0 = 0;
		for (Iterator<Employee> a0 = attendance.get(ld).iterator(); a0.hasNext();) {
			if (a0.next().isStatus())
				++count0;
		}
		System.out.println("attendance of " + ld + " is=" + count0);
	}
}
