package com.bridgelabz;

import java.util.Scanner;

public class UserRegistration {
	Scanner scanner = new Scanner(System.in);
	    String firstName;
	    String lastName;
	    String email;
	    String phoneNumber;

	    //name validation
	    public boolean FirstNameValidate(String firstName) {
	        String pattern = "^[A-Z][a-zA-Z]{2,}$";

	        if (firstName.matches(pattern)) {
	            System.out.println("valid First name");
	            return true;
	        }
	        else {
	            System.out.println("Invalid First name");
	            return false;

	        }
	    }
	    
	    public boolean LastNameValidate(String lastName) {
	        String pattern = "^[A-Z][a-zA-Z]{2,}$";

	        if (lastName.matches(pattern)) {
	            System.out.println("valid last name");
	            return true;
	        }
	        else {
	            System.out.println("Invalid last name");
	            return false;
	        }
	    }

	    //email validation
	    public boolean emailValidator(String email) {
	        String pattern = "^[0-9a-zA-Z]+([.\\-+]?[a-zA-Z0-9]+)?\\@[0-9a-zA-Z]+.[a-zA-Z]{2,4}(.[a-zA-Z]{2,})*$";

	        if (email.matches(pattern)) {
	            System.out.println("valid email id");
	            return true;
	        }
	        else {
	            System.out.println("Invalid email id");
	            return false;
	        }
	    }	    
	    
	  //phone number validation
	    public boolean phoneNumberValidator(String phoneNumber) {
	        String pattern="^\\+?([0-9]{2})\\)?([0-9]{10})$";

	        if (phoneNumber.matches(pattern)) {
	            System.out.println("valid phone number");
	            return true;
	        }
	        else {
	            System.out.println("Invalid phone number");
	            return false;
	        }
	    }

	    
	    //methods
	    
	    public void userFirstName(){
	        System.out.println("Enter the First name :");
	        firstName = scanner.next();
	        boolean result =  FirstNameValidate(firstName);
	        if ( result == false) {
	            userFirstName();
	        }
	    }
	    
	    public void userLastName(){
	        System.out.println("Enter the Last name :");
	        lastName = scanner.next();
	        boolean result = LastNameValidate(lastName);
	        if ( result == false) {
	            userLastName();
	        }
	    }
	    
	    public void userEmail(){
	        System.out.println("Enter the email id :");
	        email = scanner.next();
	        boolean result = emailValidator(email);
	        if ( result == false) {
	            userEmail();
	        }
	    }
	    
	    public void userPhoneNumber(){
	        System.out.println("Enter the phone number:");
	        phoneNumber = scanner.next();
	        boolean result = phoneNumberValidator(phoneNumber);
	        if ( result == false) {
	            userPhoneNumber();
	        }
	    }



	    //main method
	    public static void main(String[] args) {
	        System.out.println("Welcome to user registration");

	        UserRegistration user = new UserRegistration();
	        user.userFirstName();
	        user.userLastName();
	        user.userEmail();
	        user.userPhoneNumber();
	    }
	}