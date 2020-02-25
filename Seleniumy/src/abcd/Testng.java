package abcd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testng {

	
	
	
	
@Test
public void verifygoogle(){
	System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	
}
}
