package com.bridgelabz.employeewage;

import java.util.Random;

public class EmployeeWage {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		Boolean empCheck = random.nextBoolean();  
		// We could have achieved the same thing with the below code
		// double empCheck = Math.floor(Math.random() * 10) % 2;
		
		if (empCheck == true) {
	
			System.out.println("Employee is Present");
	
		} else {
			
			System.out.println("Employee is Absent");
		
		}
	
	}

}