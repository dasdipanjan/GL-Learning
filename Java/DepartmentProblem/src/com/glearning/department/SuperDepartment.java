package com.glearning.department;

/**
 * This class contains functionality of super departments.
 * 
 * @author Amit, Arka, Latika, Dipanjan
 * @version 1.0
 * @since 02-12-2022
 *
 */
public class SuperDepartment extends Object {
	
	public SuperDepartment() {
		super();
	}

	/**
	 * This method is responsible to return department name;
	 * 
	 * @return String value.
	 */
	public String departmentName() {
		return "Super Department";
	}

	/**
	 * This method is responsible to return about today's work.
	 * 
	 * @return String value
	 */
	public String getTodaysWork() {
		return "No Work as of now";
	}

	/**
	 * This method is responsible to return about work deadline.
	 * 
	 * @return String value
	 */
	public String getWorkDeadline() {
		return "Nil";
	}

	/**
	 * This method is responsible to return about holiday.
	 * 
	 * @return String value
	 */
	public String isTodayAHoliday() {
		return "Today is not a holiday";
	}
}
