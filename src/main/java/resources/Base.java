package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;
	public WebDriver initializedriver() throws IOException {
		Properties prop=new Properties();
	
	FileInputStream fis=new FileInputStream("C:\\Users\\smith\\eclipse-workspace\\E2EProject\\src\\main\\java\\resources\\data.properties");
	prop.load(fis);//give knowledge of the property file
	String browsername=prop.getProperty("browser");
	if(browsername.equals("chrome")) //cannot use "==" while extracting value from property
	{
		 
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\smith\\Desktop\\chromedriver.exe");
		  driver=new ChromeDriver();
	}
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	return driver;//so that we could use in our testcases
	}

}