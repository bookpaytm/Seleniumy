package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orderstatus {
public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
driver=new ChromeDriver();
driver.get("http://www.gcrit.com/build3/admin/login.php");
driver.findElement(By.name("username")).sendKeys("admin");
driver.findElement(By.name("password")).sendKeys("admin@123");
driver.findElement(By.id("tdb1")).click();
driver.get("http://www.gcrit.com/build3/admin/orders_status.php");
driver.findElement(By.linkText("Edit")).click();
driver.findElement(By.name("orders_status_name[1]")).clear();
driver.findElement(By.name("orders_status_name[1]")).sendKeys("1shaboo");
WebElement checkbox=driver.findElement(By.name("public_flag"));
checkbox.click();
WebElement checkbox1=driver.findElement(By.name("downloads_flag"));
checkbox1.click();
driver.findElement(By.id("tdb1")).click();
	}

}
