package TESTNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pomclasses.flipcarthome;
import Pomclasses.flipcartnextpage;

public class testingflipcart {
	
		   WebDriver driver ;
		  @BeforeClass
		  public void beforemclass() {
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\automation\\chromedriver_win32\\chromedriver.exe");
		      driver= new ChromeDriver();
		     driver .manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  System.out.println("beforeclass");

		  }

		  @BeforeMethod
		  public void beforemethod()
		  {
			  driver.get("https://www.flipkart.com/");
			  flipcarthome  flipcarthome1 = new flipcarthome  (driver);
			    flipcarthome1.gethome();
			    flipcarthome1.getmobile();
		  }
			
			@Test
			
				public void test() throws InterruptedException {
	    	flipcartnextpage flipcartnextpage=new flipcartnextpage (driver);
			flipcartnextpage.getsearchbox();
			flipcartnextpage.getsearch();
			flipcartnextpage.getoneplus();
			flipcartnextpage.getbuynow();
			}

@AfterMethod

public void aftermethod() {
	  
	  System.out.println(" aftermethod");
	  }
	  
@AfterClass

public void afterclass() {
	  
	  System.out.println("afterclass");
}}

		  
		  