package com.bridgelabz.employeewage;

//import java.util.Random;

public class EmployeeWage {
	
	public static void main(String[] args) {
		
		int EMP_WAGE_HOUR = 20;
		int FULL_DAY_HOUR = 8;
		int PART_DAY_HOUR = 4;
		
		int emp_Daily_Wage = EMP_WAGE_HOUR * FULL_DAY_HOUR;
		int emp_PartTime_Wage = EMP_WAGE_HOUR * PART_DAY_HOUR;
		
		
		System.out.println("Employee Daily Wage for 8 Hours in a Day is : " + emp_Daily_Wage);
		System.out.println("Employee Part Time Wage for 4 Hours in a Day is : " + emp_PartTime_Wage);
		
	}

}