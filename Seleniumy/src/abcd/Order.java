package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Order {
public static WebDriver driver;
	public static void main(String[] args) {
	
		
		
System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
driver=new ChromeDriver();
driver.get("http://www.gcrit.com/build3/admin/login.php");
driver.findElement(By.name("username")).sendKeys("admin");
driver.findElement(By.name("password")).sendKeys("admin@123");
driver.findElement(By.id("tdb1")).click();
driver.get("http://www.gcrit.com/build3/admin/index.php");
//driver.findElement(By.linkText("Currencies")).click();
driver.get("http://www.gcrit.com/build3/admin/currencies.php");
//driver.findElement(By.linkText("Edit")).click();
driver.findElement(By.linkText("New Currency")).click();
driver.findElement(By.name("title")).sendKeys("1addcurrency");
driver.findElement(By.name("code")).sendKeys("01234567");
driver.findElement(By.name("symbol_left")).sendKeys("0000");
driver.findElement(By.name("symbol_right")).sendKeys("00");
driver.findElement(By.name("decimal_point")).sendKeys("10");
driver.findElement(By.name("thousands_point")).sendKeys("1000");
driver.findElement(By.name("decimal_places")).sendKeys("0.00");
driver.findElement(By.name("value")).sendKeys("100");
driver.findElement(By.id("tdb1")).click();

	}

}
