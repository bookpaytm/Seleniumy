package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Manufacturers {

	
	
	
	
	
	
public static WebDriver driver;
	
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
driver=new ChromeDriver();
driver.get("http://www.gcrit.com/build3/admin/login.php");
driver.findElement(By.name("username")).sendKeys("admin");
driver.findElement(By.name("password")).sendKeys("admin@123");
driver.findElement(By.id("tdb1")).click();
driver.get("http://www.gcrit.com/build3/admin/categories.php");
driver.findElement(By.linkText("Manufacturers")).click();
driver.findElement(By.linkText("Edit")).click();
driver.findElement(By.name("manufacturers_name")).sendKeys("1ASUSLAPTOP");
driver.findElement(By.name("manufacturers_image")).sendKeys("C:/Users/salman/Pictures/asuslaptop.png");
driver.findElement(By.name("manufacturers_url[1]")).sendKeys("https://www.asuslaptop.com");
driver.findElement(By.id("tdb1")).click();
Select dropdown=new Select(driver.findElement(By.name("page")));
dropdown.selectByVisibleText("2");
driver.findElement(By.id("tdb1")).click();

	}

}
