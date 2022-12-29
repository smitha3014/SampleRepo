package Automationn.E2EProject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageobject.Makeappointment;
import pageobject.Validatebooking;

public class ValidateBookingPage extends Appointmentpage{
	@Test(priority=3)
	public void validate() throws IOException{
		Validatebooking vb=new Validatebooking(driver);
		Assert.assertEquals(vb.valid().getText(), "We Care About Your Health");
		driver.close();
	}
 

}

