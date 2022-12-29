package Automationn.E2EProject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobject.Home;
import pageobject.Login;


public class LoginPage extends Homepage {
	
	@Test
	public void sitelogin() {
		//Access methods of other class-->1.inheritance 2.create object of that class and invoke methods
		Login lg=new Login(driver);
		lg.getusrname().sendKeys("John Doe");
		lg.getpasswrd().sendKeys("ThisIsNotAPassword");
		lg.gologin().click();
	}

}
