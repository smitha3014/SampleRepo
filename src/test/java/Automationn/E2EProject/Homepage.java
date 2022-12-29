package Automationn.E2EProject;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.Home;
import resources.Base;

public class Homepage extends Base {
	@BeforeTest
		public void invokebrowser() throws IOException {
			driver=initializedriver();//(this one has life ,so taking this to the login class,ln 16-->sending as argument)
			driver.get(" https://katalon-demo-cura.herokuapp.com");
			Home h=new Home(driver);
			h.getnavigationbar().click();
			h.getlogin().click();
			
		
	}

}
