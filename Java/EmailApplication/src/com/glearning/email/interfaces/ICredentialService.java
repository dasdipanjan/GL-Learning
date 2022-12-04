package com.glearning.email.interfaces;

import com.glearning.email.model.Employee;

/**
 * 
 * @author Dipanjan
 *
 */
public interface ICredentialService {
	String generatePassword();
	String generateEmailAddress(Employee employee);
	void showCredentials(Employee employee);
}
