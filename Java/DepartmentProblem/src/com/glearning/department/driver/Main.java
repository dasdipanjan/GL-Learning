package com.glearning.department.driver;

import com.glearning.department.AdminDepartment;
import com.glearning.department.HrDepartment;
import com.glearning.department.SuperDepartment;
import com.glearning.department.TechDepartment;

/**
 * This class is responsible to create the object of HrDepartment,
 * TechDepartment, AdminDepartment class and call required methods to display functionalities..
 * 
 * @author Dipanjan Das
 * @version 1.0
 * @since 02-12-2022
 *
 */
public class Main {

	public Main() {
		super();
	}
	
	/**
	 * This method is the starting point of the program. This method is invoked by main thread created by JVM.
	 * 
	 * @param args this variable is responsible to carry command line arguments.
	 * @throws  
	 */
	public static void main(String[] args) {

		SuperDepartment superDepartment = null;
		// Creating object of AdminDepartment, HrDepartment and TechDepartment class.
		HrDepartment hrDepartment = new HrDepartment();
		TechDepartment techDepartment = new TechDepartment();
		AdminDepartment adminDepartment = new AdminDepartment();
		
		System.out.println();
		
		// Displaying all functionality of AdminDepartment -Start.
		System.out.println("Welcome to " + adminDepartment.departmentName());
		System.out.println(adminDepartment.getTodaysWork());
		System.out.println(adminDepartment.getWorkDeadline());
		//Up casting - Using super class reference variable.
		superDepartment = adminDepartment;
		System.out.println(superDepartment.isTodayAHoliday());
		// Displaying all functionality of AdminDepartment -end.

		System.out.println();

		// Displaying all functionality of HrDepartment -Start.
		System.out.println("Welcome to " + hrDepartment.departmentName());
		System.out.println(hrDepartment.doActivity());
		System.out.println(hrDepartment.getTodaysWork());
		System.out.println(hrDepartment.getWorkDeadline());
		//Up casting - Using super class reference variable.
		superDepartment = hrDepartment;
		System.out.println(superDepartment.isTodayAHoliday());
		// Displaying all functionality of HrDepartment -End.

		System.out.println();
		
		// Displaying all functionality of TechDepartment -Start.
		System.out.println("Welcome to " + techDepartment.departmentName());
		System.out.println(techDepartment.getTodaysWork());
		System.out.println(techDepartment.getWorkDeadline());
		System.out.println(techDepartment.getTechStackInformation());
		//Up casting - Using super class reference variable.
		superDepartment = techDepartment;
		System.out.println(superDepartment.isTodayAHoliday());
		// Displaying all functionality of TechDepartment -End.
	}

}
