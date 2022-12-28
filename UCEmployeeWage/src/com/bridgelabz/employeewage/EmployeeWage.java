package com.bridgelabz.employeewage;

import java.util.Random;

public class EmployeeWage {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int empCheck = random.nextInt(3) + 1;
		
		int EMP_WAGE_HOUR = 20;
		
		switch (empCheck) {
		
			case 1:
				int FULL_DAY_HOUR = 8;
				int emp_Daily_Wage = empWage ( EMP_WAGE_HOUR , FULL_DAY_HOUR);
				System.out.println("Employee Daily Wage for 8 Hours in a Day is : " + emp_Daily_Wage);
				break;
		
			case 2:
				int PART_DAY_HOUR = 4;
				int emp_PartTime_Wage = empWage ( EMP_WAGE_HOUR , PART_DAY_HOUR );
				System.out.println("Employee Part Time Wage for 4 Hours in a Day is : " + emp_PartTime_Wage);
				break;
			
			default:
				System.out.println("Employee is Absent, Wage is Zero");
		}		
	}
		
	
	public static int empWage ( int x , int y ) {
		
		return x * y;
	}
	
}