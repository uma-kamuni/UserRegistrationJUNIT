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
		boolean result = userValidator.FirstNameValidate("Uma");
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
		boolean result = userValidator.LastNameValidate("Kam");
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
	
}