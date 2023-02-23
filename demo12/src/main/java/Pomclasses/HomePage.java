package Pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
		@FindBy (xpath="(//a[@class='nav-link'])[1]")
		private WebElement home;
	
		@FindBy (xpath="(//a[@class='btn btn-primary btn-lg waves-effect waves-light'])[1]")
		private WebElement dthconnection;
		
		public HomePage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
			public void getHomePage () {
				home.click();
				
				
			}
			public void getdthconnection () {
				dthconnection.click();
			}
			
}
