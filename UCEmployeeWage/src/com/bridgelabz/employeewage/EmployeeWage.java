package com.bridgelabz.employeewage;

import java.util.Random;

public class EmployeeWage {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int empCheck = random.nextInt(3) + 1;  // If 1 = Full Time, if 2 = Part Time & 3 = Absent
		
		final int EMP_WAGE_HOUR = 20;
		
		final int NO_OF_WORKING_DAYS = 20;
		
		int workingHour = 0;
		
		if (empCheck == 1) { System.out.println("Employee is Full Time");}
		if (empCheck == 2) { System.out.println("Employee is Part Time");}
		if (empCheck == 3) { System.out.println("Employee is Absent");}
		
		
		for (int day = 1; day <= NO_OF_WORKING_DAYS; day++  ) {
		
			switch (empCheck) {
		
				case 1: // FULL TIME
					workingHour = workingHour + 8;
					break; 
		
				case 2: // PART  TIME
					workingHour = workingHour + 4;
					break;
			
				default: // ABSENT
					workingHour = 0;
			}
		}
		
		int empWage = EMP_WAGE_HOUR * workingHour;
		
		System.out.println("Employee Wage for the Month is : " + empWage );
		
	}
	
}