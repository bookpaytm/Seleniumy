package abcd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Crossbrowser2 {

	
	
	
	
	
public static WebDriver Startapplication(WebDriver driver,String browsername,String appurl){
if(browsername.equals("Chrome")){
	System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
	driver=new ChromeDriver();
		
	}
else if(browsername.equals("Firefox")){
	System.setProperty("webdriver.chrome.driver", "F:/geckodriver.exe");
	driver=new FirefoxDriver();
}
driver.manage().window().maximize();
driver.get("https://www.google.com");	
return driver;
}	

public static void quitbrowser(WebDriver driver){
	driver.close();
	
}
}
