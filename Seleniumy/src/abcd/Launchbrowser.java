package abcd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Launchbrowser {

public static WebDriver driver;	
	
	
	
	
@BeforeClass
public void verifyLaunchbrowser(){
System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
 driver=new ChromeDriver();	
}
@AfterClass
public void closebrowser(){
	driver.close();
}
@Test(priority=1)
public void verifygoogletitle(){
driver.get("https://www.google.com");
Assert.assertEquals("Google", driver.getTitle());

}
/*@Test(priority=3)
public void verifyamazontitle(){
driver.get("https://www.amazon.com/");
Assert.assertEquals("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more", driver.getTitle());
}*/

@Test(priority=2)
public void verifysnapdealtitle(){
		driver.get("https://www.snapdeal.com/");
		Assert.assertEquals("Online Shopping Site India - Shop Electronics, Mobiles, Men & Women Clothing, Shoes - www. Snapdeal.com", driver.getTitle());
	}

}








