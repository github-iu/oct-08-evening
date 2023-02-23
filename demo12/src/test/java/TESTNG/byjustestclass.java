package TESTNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Pomclasses.byjushomepage;
import Pomclasses.calculater;

public class byjustestclass
{

	 WebDriver driver ;
	
	
	 @BeforeClass
	  public void beforemclass() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\automation\\chromedriver_win32\\chromedriver.exe");
	     WebDriver drivertest = new ChromeDriver();
	     drivertest .manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    System.out.println(" beforemethod");
		 
	 }
	 
	 @BeforeMethod
	 public void beforemethod() {
		 
		 driver .get("https://byjus.com/");
	     byjushomepage  byjushomepage = new  byjushomepage (driver);
	      byjushomepage.clickonstudy();
	      
	      byjushomepage.calculater();
}
	 
	 @test
	 public void test() throws InterruptedException{
	 calculater  calculater1 = new calculater();
     calculater1.getimagecal();
     Thread.sleep(2000);
     calculater1.getadd2no();
     calculater1.getfirstno();
     calculater1.getsecondno();
     calculater1.getthirdno();
     calculater1.getfourth();
     
     calculater1.getequalno();
 calculater1.getequalno2();
     calculater1.getsolve();
	 
	 }
	

		@AfterMethod
		
		public void aftermethod() {
			System.out.println("Aftermethod");
			
			
			
		}
		
		
		
		@AfterClass

		public void afterclass() {
			System.out.println("@AfterClass");
			
		}
}
