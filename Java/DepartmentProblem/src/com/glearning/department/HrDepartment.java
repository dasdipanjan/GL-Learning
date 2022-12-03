package com.glearning.department;

/**
 * This class contains functionality of HR departments.
 * 
 * @author Dipanjan Das
 * @version 1.0
 * @since 02-12-2022
 *
 */
public class HrDepartment extends SuperDepartment {

	public HrDepartment() {
		super();
	}

	/**
	 * This method is responsible to return department name;
	 * 
	 * @return String value.
	 */
	@Override
	public String departmentName() {
		return "Hr Department";
	}

	/**
	 * This method is responsible to return about today's work.
	 * 
	 * @return String value.
	 */
	@Override
	public String getTodaysWork() {
		return "Fill today’s timesheet and mark your attendance";
	}

	/**
	 * This method is responsible to return about work deadline.
	 * 
	 * @return String value
	 */
	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	/**
	 * This method is responsible to return activity details.
	 * 
	 * @return String value
	 */
	public String doActivity() {
		return "team Lunch";
	}
}
