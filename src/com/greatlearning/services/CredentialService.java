package com.greatlearning.services;
import java.util.Random;

import com.greatlearning.interfaces.ICredentials;
import com.greatlearning.model.Employee;

public class CredentialService implements ICredentials {

	@Override
	public String generateEmailAddress(Employee employee, String department) {
		return employee.getFirstName()+employee.getLastName()+"@"+department+".gl.in";
	
	}

	@Override
	public String generatePassword() {
		  String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      String lowerLetters = "abcdefghijklmnopqrstuvwxyz";
	      String specialCharacters = "!@#$";
	      String numbers = "1234567890";
	      String values = capitalLetters + lowerLetters + specialCharacters + numbers;
	      Random random = new Random();
	      String password = "";
	      
	      String capitalChar = String.valueOf(capitalLetters.charAt(random.nextInt(capitalLetters.length())));
	      String numberChar = String.valueOf(numbers.charAt(random.nextInt(numbers.length())));
	      String lowerChar = String.valueOf(lowerLetters.charAt(random.nextInt(lowerLetters.length())));
	      String specialChar = String.valueOf(specialCharacters.charAt(random.nextInt(specialCharacters.length())));
	      for(int i = 0; i< 8 ; i++) {
	          password += String.valueOf(values.charAt(random.nextInt(values.length())));
	       }
	      
	      return password;
	      
	      }
	

	@Override
	public void showCredentials(Employee employee) {
		System.out.println("Dear " + employee.getFirstName() + " your password is now set" );
		System.out.println("Email = "+employee.getEmail());
		System.out.println("Password = " + employee.getPassword());
		
		
	}
	

}
