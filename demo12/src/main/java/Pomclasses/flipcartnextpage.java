package Pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flipcartnextpage {

	@FindBy( xpath = "//input[@type='text']")
	private WebElement searchbox;
	
	
	@FindBy( xpath = "//button[@type='submit']")
	private WebElement search;
	
	

	@FindBy( xpath = "((//a[@title='OnePlus 10R 5G (Forest Green, 128 GB)'])[1]")
	private WebElement oneplus;
	
 
	

	@FindBy( xpath = "//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")
	private WebElement byenow ;
	
	public flipcartnextpage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void getsearchbox() {
		searchbox.click();
		
	}

	public void getsearch() {
	search.click();
	
}
	
public void getoneplus() {
	oneplus.click();
}
public void getbuynow() {
	byenow.click();
}

	
	
	
	
	
	
	
}


