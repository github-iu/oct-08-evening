package TESTNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pomclasses.DetailsPage;
import Pomclasses.HomePage;

public class TESTCLASS {
   WebDriver driver ;
  @BeforeClass
  public void beforemclass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\automation\\chromedriver_win32\\chromedriver.exe");
	      driver= new ChromeDriver();
	     driver .manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  System.out.println("beforeclass");
  }
	@BeforeMethod
public void beforemethod() {
		 driver .get("https://www.tataplay.com/");
		 HomePage homePage= new HomePage (driver);
	       homePage.getHomePage();
	       homePage.getdthconnection();
	       
	  System.out.println("beforemethod");
	
	}
	
	@Test
	
	
	public void test() throws InterruptedException {
		DetailsPage  DetailsPage = new DetailsPage (driver );
	       Thread.sleep(2000);
	       DetailsPage.getfirstname();
	       DetailsPage.getlastname();
	       DetailsPage.getphoneno();
	       
	       DetailsPage.getid();
	       DetailsPage.getpincode();
	       DetailsPage.getcontinu() ;
		  
		  System.out.println("test");

}
	@AfterMethod
	
	public void aftermethod() {
		  
		  System.out.println(" aftermethod");}
	
	
	@AfterClass

	public void afterclass() {
		  
		  System.out.println("afterclass");
	}}
	
