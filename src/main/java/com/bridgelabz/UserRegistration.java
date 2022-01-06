package com.bridgelabz;

import java.util.Scanner;

public class UserRegistration {
	Scanner scanner = new Scanner(System.in);
	    String firstName;

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
	    public void userFirstName(){
	        System.out.println("Enter the First name :");
	        firstName = scanner.next();
	        boolean result =  FirstNameValidate(firstName);
	        if ( result == false) {
	            userFirstName();
	        }
	    }
	    public static void main(String[] args) {
	        System.out.println("Welcome to user registration");

	        UserRegistration user = new UserRegistration();
	        user.userFirstName();
	    }
	}