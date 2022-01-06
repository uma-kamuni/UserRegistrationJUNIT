package com.bridgelabz;

import java.util.Scanner;

public class UserRegistration {
	Scanner scanner = new Scanner(System.in);
	    String firstName;
	    String lastName;

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


	    //main method
	    public static void main(String[] args) {
	        System.out.println("Welcome to user registration");

	        UserRegistration user = new UserRegistration();
	        user.userFirstName();
	        user.userLastName();
	    }
	}