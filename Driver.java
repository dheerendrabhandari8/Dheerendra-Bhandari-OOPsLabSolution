package com.greatlearning.labs.employee1;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Please enter your first Name");
		String fName = sc.next();
		
		System.out.println("Please enter your last Name");
		String lName = sc.next();
		
		
		Employee emp1 = new Employee(fName, lName);
		CredentialService cs = new CredentialService();
		
		String generateEmail;
		char[] generatedPassword;
		
		
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		int num = sc.nextInt();
		
		if (num == 1) {
			generateEmail = cs.generateEmail(emp1.getfirstName().toLowerCase(), emp1.getlastName().toLowerCase(), "tech");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(emp1, generateEmail, generatedPassword);
			}
		else if (num ==2) {
			generateEmail = cs.generateEmail(emp1.getfirstName().toLowerCase(), emp1.getlastName().toLowerCase(), "adm");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(emp1, generateEmail, generatedPassword);
		}
		else if (num ==3) {
			generateEmail = cs.generateEmail(emp1.getfirstName().toLowerCase(), emp1.getlastName().toLowerCase(), "hr");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(emp1, generateEmail, generatedPassword);
		}
		else if (num ==4) {
			generateEmail = cs.generateEmail(emp1.getfirstName().toLowerCase(), emp1.getlastName().toLowerCase(), "legal");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(emp1, generateEmail, generatedPassword);
		}
		else 
			System.out.println("Incorrect value entered");
	}
}



