package com.greatlearning.main;
import com.greatlearning.model.Employee ;

import java.util.Scanner;
import com.greatlearning.services.*;
public class Driver {
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		Employee employee = new Employee("Shilpa", "Kamboj");
		displayMenu();
		
		int option = scanner.nextInt();
		System.out.println(option);
		CredentialService credentialService = new CredentialService();
		
		String[] departments = {"tech","Admin","Human Resources","Legal"};
		String emailAddress =credentialService.generateEmailAddress(employee, departments[option-1]);
		System.out.println(emailAddress);
		
		String password = credentialService.generatePassword();
		System.out.println(password);
		employee.setEmail(emailAddress);
		employee.setPassword(password);
		credentialService.showCredentials(employee);
		
		
		
		}

	private static void displayMenu() {
		System.out.println("Please enter the department from the following");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resource");
		System.out.println("4.Legal");
		
		
	}
	
}
