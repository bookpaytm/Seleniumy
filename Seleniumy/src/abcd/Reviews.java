package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reviews {
public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.gcrit.com/build3/admin/login.php");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.id("tdb1")).click();
		driver.findElement(By.linkText("Online Catalog")).click();
		driver.findElement(By.linkText("1ASUSLAPTOP")).click();
		driver.findElement(By.id("tdb5")).click();
		driver.findElement(By.id("tdb6")).click();
		
	}

}
