package com.bridgelabz.employeewage;

import java.util.Random;

public class EmployeeWage {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int empCheck = random.nextInt(3) + 1;
			
		if (empCheck > 1) {
			
			System.out.println("Employee is present");
			
			int EMP_WAGE_HOUR = 20;
			
			if (empCheck == 2) {
				int FULL_DAY_HOUR = 8;
				int emp_Daily_Wage = EMP_WAGE_HOUR * FULL_DAY_HOUR;
				System.out.println("Employee Daily Wage for 8 Hours in a Day is : " + emp_Daily_Wage);
				
			} else {
				int PART_DAY_HOUR = 4;
				int emp_PartTime_Wage = EMP_WAGE_HOUR * PART_DAY_HOUR;
				System.out.println("Employee Part Time Wage for 4 Hours in a Day is : " + emp_PartTime_Wage);
				
			}
			
		} else {
			
			System.out.println("Employee is absent, his Wage is Zero");
			
		}	
		
	}

}