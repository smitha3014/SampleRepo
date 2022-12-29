package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	
public WebDriver driver;//this driver has no life

   By username=By.name("username");
   By password=By.name("password");
   By login=By.xpath("//button[text()='Login']");
  
   
   
   public Login(WebDriver driver) {
	// TODO Auto-generated constructor stub
	   this.driver=driver;//ln.9 -->refers to the driver here
}

   public WebElement getusrname() {
	 return  driver.findElement(username);
   }
   public WebElement getpasswrd() {
		 return  driver.findElement(password);
	   }
   public WebElement gologin()
   {
	return driver.findElement(login);
   }
  

}

////a[text()='Make Appointment']
//username
//password
////button[text()='Login']