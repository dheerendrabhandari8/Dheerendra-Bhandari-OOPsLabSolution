package com.greatlearning.labs.employee1;

import java.util.Random;

public class CredentialService {
	Employee emp1 = new Employee("first", "last");
	public String email;
	public String password;
	
	public String generateEmail(String firstName, String lastName, String department) {
		email = firstName + lastName +"." + department + "@abc.com";
		return email;
		}
	
	public char[] generatePassword() {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "1234567890";
		String specialChars = "!@#$%^&*";

		String values = capitalLetters + smallLetters + numbers + specialChars;
		
		Random rn = new Random();
		
		char[] password = new char[8];
		
		for (int i = 0; i < password.length; i++) {
			password[i] = values.charAt(rn.nextInt(values.length()));
		} 
		return password;
	}
	
	public void showCredentials(Employee employee, String email, char[] password) {
		System.out.println("Dear " + employee.firstName + " your generated credentials are as follows ");
		System.out.println("Email: " + email);
		System.out.println("Password: " + password);
	}
}


