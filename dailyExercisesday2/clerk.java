package com.java.dailyExercisesday2;

public class clerk extends Fifth_Employee{
	public clerk(String Employee_Name, String Department_of_Employee, String Designation, int salary) {
		super(Employee_Name,Department_of_Employee,Designation,salary);
	}
	 public void Salarycalculation() {
		 int salary = (int) (getSalary() *3);
		 System.out.println("Manager salary:"+ salary);
	 }

}