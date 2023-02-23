package byjustest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pomclasses.flipcarthome;
import Pomclasses.flipcartnextpage;

public class testflipcart {
	
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\automation\\chromedriver_win32\\chromedriver.exe");
    WebDriver drivertest = new ChromeDriver();
    drivertest .manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    drivertest .get("https://www.flipkart.com/");
    flipcarthome  flipcarthome1 = new flipcarthome  (drivertest);
    flipcarthome1.gethome();
    flipcarthome1.getmobile();


    	flipcartnextpage flipcartnextpage=new flipcartnextpage (drivertest);
		flipcartnextpage.getsearchbox();
		flipcartnextpage.getsearch();
		flipcartnextpage.getoneplus();
		flipcartnextpage.getbuynow();
   
}

}

