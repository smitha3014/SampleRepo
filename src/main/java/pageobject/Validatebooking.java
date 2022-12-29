package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Validatebooking {
	public WebDriver driver;
	By confirm=By.xpath("//*[@id=\"top\"]/div/h3");
	
	
	public Validatebooking(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


	public WebElement valid() {
		 return  driver.findElement(confirm);
	   }

}
