package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
	@Test
	public void givenFirstName_WhenValid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.FirstNameValidate("Umadevi");
		Assert.assertTrue(result);
	}

	@Test
	public void givenFirstName_WhenInvalid_ShouldReturnFalse() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.FirstNameValidate("umadevi");
		Assert.assertFalse(result);
	}

	@Test
	public void givenLastName_WhenValid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.LastNameValidate("Kamuni");
		Assert.assertTrue(result);
	}

	@Test
	public void givenLastName_WhenInvalid_ShouldReturnFalse() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.LastNameValidate("kam");
		Assert.assertFalse(result);
	}

	@Test
	public void givenEmailAddress_WhenValid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.emailValidator("kamuniumaramesh@gmail.com");
		Assert.assertTrue(result);
	}

	@Test
	public void givenEmailAddress_WhenInvalid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.emailValidator("abc(*1@gmail.com");
		Assert.assertFalse(result);
	}

	@Test
	public void givenPhoneNumber_WhenValid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.phoneNumberValidator("919146954656");
		Assert.assertTrue(result);
	}

	@Test
	public void givenPhoneNumber_WhenInvalid_ShouldReturnFalse() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.phoneNumberValidator("9825236");
		Assert.assertFalse(result);
	}

	@Test
	public void givenPassword_WhenValid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.passwordValidator("Umadevi@123");
		Assert.assertTrue(result);
	}

	@Test
	public void givenPassword_WhenInvalid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.passwordValidator("umaa11");
		Assert.assertFalse(result);
	}
}