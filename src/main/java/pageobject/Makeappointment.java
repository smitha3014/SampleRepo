package pageobject;
import java.util.List;


import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
public class Makeappointment {
	 public WebDriver driver;
	
	
		By status=By.name("facility");
		By visitdate=By.id("txt_visit_date");
		By comment=By.name("comment");
		By book=By.xpath("//button[text()='Book Appointment']");
		By homepage=By.cssSelector("a.btn.btn-default");
		// By title=By.xpath("//*[@id=\"summary\"]/div/div/div[1]/h2");
		 

			public Makeappointment(WebDriver driver) {
				// TODO Auto-generated constructor stub
				this.driver=driver;
			}
		  public void select_list(String Center){
		     Select dropdown=new Select(driver.findElement(status));
		     dropdown.selectByVisibleText(Center);
		    
		  }
		   public WebElement getdate() {
				 return  driver.findElement(visitdate);
			   }
		   public WebElement getcomment() {
				 return  driver.findElement(comment);
			   }
		   public WebElement getappointment() {
				 return  driver.findElement(book);
			   }
		   public WebElement gotohome() {
				 return  driver.findElement(homepage);
			   }
				 	 	 	 
		 /*  public WebElement gotitle()
		   {
			return driver.findElement(title);
		   }*/
		   
		   
	}
		
	

	
	

	
	
	



//Tokyo CURA Healthcare Center
//combo_facility
//https://www.demoblaze.com/