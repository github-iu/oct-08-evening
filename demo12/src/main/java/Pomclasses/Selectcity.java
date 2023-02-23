package Pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selectcity {
		//variable : webelment: 
		@FindBy (xpath = "(//img[@class='sc-fQkuQJ ciyWra'])[8]")
		private WebElement city;
	
		@FindBy (xpath = "(//a[@href='/explore/movies-pune'])[1]")
		private WebElement movie;
		//constructor: initilization
		public Selectcity  (WebDriver  driver)
		{
			PageFactory.initElements(driver, this);
}
		//methods : action on webelments
		public void clickselectcity () {
		
			
		}
}
