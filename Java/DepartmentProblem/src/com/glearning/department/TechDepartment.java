package com.glearning.department;

/**
 * This class contains functionality of technical departments.
 * 
 * @author Dipanjan Das
 * @version 1.0
 * @since 02-12-2022
 *
 */
public class TechDepartment extends SuperDepartment {

	public TechDepartment() {
		super();
	}

	/**
	 * This method is responsible to return department name;
	 * 
	 * @return String value.
	 */
	@Override
	public String departmentName() {
		return "Tech Department";
	}

	/**
	 * This method is responsible to return about today's work.
	 * 
	 * @return String value.
	 */
	@Override
	public String getTodaysWork() {
		return "Complete coding of module 1";
	}

	/**
	 * This method is responsible to return about work deadline.
	 * 
	 * @return String value
	 */
	@Override
	public String getWorkDeadline() {
		// TODO Auto-generated method stub
		return "Complete by EOD";
	}

	/**
	 * This method is responsible to provide technical information about technical
	 * department.
	 * 
	 * @return
	 */
	public String getTechStackInformation() {
		return "Core Java";
	}
}
