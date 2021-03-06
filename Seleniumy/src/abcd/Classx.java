package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Classx {
	
	
	
	public static WebDriver driver;
  @Test(groups={"sanity","regression"},priority=1)
 public void launchbrowser(){
	  System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
	  driver=new ChromeDriver();
  }
  @Test(groups={"sanity","regression"},priority=5)
  public void closebrowser(){
	  driver.close();
  }
  @Test(groups={"sanity","regression"},priority=2)
  public void verifygoogle(){
	  driver.get("https://www.google.com");
	  Assert.assertEquals("Google", driver.getTitle());
  }
  @Test(groups={"regression"},priority=3)
  public void verifysnapdeal(){
	  driver.get("https://www.snapdeal.com/");
	  Assert.assertEquals("Online Shopping Site India - Shop Electronics, Mobiles, Men & Women Clothing, Shoes - www. Snapdeal.com", driver.getTitle());
  }
@Test(groups={"sanity"},priority=4)
public void verifygcrit(){
	driver.get("http://www.gcrit.com/build3/admin/login.php");
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("password")).sendKeys("admin@123");
	driver.findElement(By.id("tdb1")).click();
	Assert.assertEquals("GCR Shop", driver.getTitle());
}
}
