package Automationn.E2EProject;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobject.Makeappointment;

public class Appointmentpage extends LoginPage {
	@Test(priority=2,dataProvider="getData")
	public void booking(String date,String com) throws IOException{
		Makeappointment mk=new Makeappointment(driver);
	     mk.select_list("Hongkong CURA Healthcare Center");
	     mk.getdate().sendKeys(date);
	     mk.getcomment().sendKeys(com);
	     
	     mk.getappointment().click();
	     mk.gotohome().click();

	     }
	@DataProvider(name="getData")
	public Object[][] getData() {
		//row stands for how many different data
		//coloumn stands for how many value per each test
		Object[][] data=new Object[2][2];
		//0th row
		data[0][0]="20/07/2022";
		data[0][1]="fever";
		//1st row
		data[1][0]="21/07/2022";
		data[1][1]="cough";
		return data;
	}	
	
		
	
}

