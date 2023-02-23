package Pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetailsPage {
	@FindBy (xpath=" //input[@id='firstName']")
	private WebElement firstname;

	@FindBy (xpath=" (//input[@class='form-control'])[2]")
	private WebElement lastname;
	

	@FindBy (xpath=" (//input[@class='form-control'])[3]")
	private WebElement phoneno;
	
	@FindBy (xpath=" //input[@id='emailId']")
	private WebElement id;
	
	@FindBy (xpath=" (//input[@class='form-control'])[5]")
	private WebElement pincode;
	

	@FindBy (xpath=" //span[@class='MuiButton-label']")
	private WebElement continu;
	
	
	public DetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		public void getfirstname () {
			firstname.sendKeys("niranjan");
			
			
		}
		public void getlastname ()
	{
			lastname.sendKeys("tawashikar");
		}
		public void getphoneno () {
			 phoneno.sendKeys("8888888888");
		}
		public void getid () {
			id.sendKeys("niranjan@gmail.com");}
		public void getpincode() {
			 pincode.sendKeys("413604");
			 }
		public void getcontinu() {
			continu.click();;}}
		
		
		
		