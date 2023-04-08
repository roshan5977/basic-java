package com.feuji.feb13;
l

public class ConvertJson {
   		
	public static void main(String[] args) {
      Employee employee =new Employee();
      employee=getEmployee(employee);
      System.out.println(new Gson());
	}

	private static Employee getEmployee(Employee employee) {
       employee.setEmpid(7574);
       employee.setMaried(false);
       employee.setName("Roshan");
		return employee;
	}

}
