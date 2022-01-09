package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
	@Test
	public void givenFirstName_WhenValid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		try {
			Assert.assertTrue(userValidator.FirstNameValidate("Umadevi"));
		} catch (UserRegistrationException e) {
		}
	}

	@Test
	public void givenFirstName_WhenInvalid_ShouldReturnFalse() {
		UserRegistration userValidator = new UserRegistration();
		try {
			userValidator.FirstNameValidate("umadevi");
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Please enter a valid first name", e.getMessage());
		}
	}

	@Test
	public void givenLastName_WhenValid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		try {
			Assert.assertTrue(userValidator.LastNameValidate("Kamuni"));
		} catch (UserRegistrationException e) {
		}
	}

	@Test
	public void givenLastName_WhenInvalid_ShouldReturnFalse() {
		UserRegistration userValidator = new UserRegistration();
		try {
			userValidator.LastNameValidate("kam");
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Please enter a valid last name", e.getMessage());
		}
	}

	@Test
	public void givenEmailAddress_WhenValid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		try {
			Assert.assertTrue(userValidator.emailValidator("kamuniumaramesh@gmail.com"));
		} catch (UserRegistrationException e) {
		}
	}

	@Test
	public void givenEmailAddress_WhenInvalid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		try {
			userValidator.emailValidator("abc()*@gmail.com");
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Please enter a valid email id", e.getMessage());
		}
	}

	@Test
	public void givenPhoneNumber_WhenValid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		try {
			Assert.assertTrue(userValidator.phoneNumberValidator("919146954656"));
		} catch (UserRegistrationException e) {
		}
	}

	@Test
	public void givenPhoneNumber_WhenInvalid_ShouldReturnFalse() {
		UserRegistration userValidator = new UserRegistration();
		try {
			userValidator.phoneNumberValidator("9825236");
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Please enter a valid phone number", e.getMessage());
		}
	}

	@Test
	public void givenPassword_WhenValid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		try {
			Assert.assertTrue(userValidator.passwordValidator("Umadevi@123"));
		} catch (UserRegistrationException e) {
		}
	}

	@Test
	public void givenPassword_WhenInvalid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		try {
			userValidator.passwordValidator("umaa11");
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Please enter a valid password", e.getMessage());
		}
	}

}