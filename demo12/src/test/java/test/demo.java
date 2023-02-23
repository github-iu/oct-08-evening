package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pomclasses.DetailsPage;
import Pomclasses.HomePage;

public class demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\automation\\chromedriver_win32\\chromedriver.exe");
	     WebDriver drivertest = new ChromeDriver();
	     drivertest .manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     drivertest .get("https://www.tataplay.com/");
	     
	     HomePage homePage= new HomePage (drivertest );
	       homePage.getHomePage();
	       homePage.getdthconnection();
	       
	       DetailsPage  DetailsPage = new DetailsPage (drivertest );
	       Thread.sleep(2000);
	       DetailsPage.getfirstname();
	       DetailsPage.getlastname();
	       DetailsPage.getphoneno();
	       
	       DetailsPage.getid();
	       DetailsPage.getpincode();
	       DetailsPage.getcontinu() ;
	       
	}

}
