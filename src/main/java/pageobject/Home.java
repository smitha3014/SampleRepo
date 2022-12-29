package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {
	public WebDriver driver;
	By navbar=By.id("menu-toggle");
    By login=By.xpath("//a[text()='Login']");
    
    public Home(WebDriver driver) {
		// TODO Auto-generated constructor stub
    	this.driver=driver;
	}

	public WebElement getnavigationbar() {
    	return driver.findElement(navbar);
    }
    
    public WebElement getlogin() {
    	return driver.findElement(login);
    }
}
