package Pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class byjushomepage {


	@FindBy (xpath = "(//a[@class='dropdown-toggle'])[1]")
	private WebElement study ;
	
	@FindBy (xpath = "(//a[@href='/calculators/'])[1]")
	private WebElement calculater ;
	
	
	public  byjushomepage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	 public void clickonstudy () {
		 study.click();
	 }
	
	
	public void calculater ( ) {
		calculater.click();
	}
}
