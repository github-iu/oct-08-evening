package Pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class calculater {


	@FindBy (xpath = "//img[@title='Online Math calculator']")
	private WebElement imagecal ;
	

	@FindBy (xpath = "//a[@href='https://byjus.com/2-digit-number-addition-calculator/']")
	private WebElement add2no ;
	
	

	@FindBy (xpath = "//input[@id='a']']")
	private WebElement firstno ;
	

	@FindBy (xpath = " //input[@id='b']]")
	private WebElement secondno ;
	  

	@FindBy (xpath = " //input[@id='c']]")
	private WebElement thirdno ;
	

	@FindBy (xpath = " //input[@id='d']]")
	private WebElement fourthno ;
	
	

	@FindBy (xpath = " //input[@id='_ansb'")
	private WebElement equalno ;
	

	@FindBy (xpath = " //input[@id='_ansa']")
	private WebElement equalno2 ;
	
	@FindBy (xpath = " //input[@class='clcbtn']")
	private WebElement solve ;
	
	

	public  void calculater(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void getimagecal  () {
		imagecal.click();
	}
		
	
	public void getadd2no () {
		add2no.click();
	
	}

	
	public void getfirstno () {
		 firstno.sendKeys("5");
}
	

	public void getsecondno () {
		 secondno.sendKeys("6");
	}
	
	

	public void getthirdno () {
		 thirdno.sendKeys("7");
	
	}
	

	public void getfourth () {
		 fourthno.sendKeys("7");
	}
	
	

	public void getequalno () {
		equalno.click();
		 
	}
			public void getequalno2 () {
				equalno2.click();
				 
			}	 
				 

			public void getsolve () {
				solve.click(); 
			}}
				