package byjustest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pomclasses.HomePage;
import Pomclasses.byjushomepage;
import Pomclasses.calculater;

public class test {

	private static final String drivertest = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\automation\\chromedriver_win32\\chromedriver.exe");
	     WebDriver drivertest = new ChromeDriver();
	     drivertest .manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     drivertest .get("https://byjus.com/");
	     byjushomepage  byjushomepage = new  byjushomepage (drivertest);
	      byjushomepage.clickonstudy();
	      
	      byjushomepage.calculater();
	      calculater  calculater1 = new calculater();
	      calculater1.getimagecal();
	      calculater1.getadd2no();
	      calculater1.getfirstno();
	      calculater1.getsecondno();
          calculater1.getthirdno();
	      calculater1.getfourth();
	      
	      calculater1.getequalno();
      calculater1.getequalno2();
	      calculater1.getsolve();
	}}


