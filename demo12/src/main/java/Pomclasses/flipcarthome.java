package Pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flipcarthome {
	@FindBy( xpath = "//button[@class='_2KpZ6l _2doB4z']")
	private WebElement home;
	
	@FindBy( xpath = "//img[@alt='Mobiles']")
	 WebElement mobile;
	
    public flipcarthome  (WebDriver driver) {
    PageFactory.initElements(driver, this);
	
	
	
    }
    
    public void gethome() {
    home.click();
    }
    
    public void getmobile() {
    	mobile.click();
    }
}
