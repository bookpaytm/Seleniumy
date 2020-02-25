package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Createaccounts {
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
driver.findElement(By.linkText("login")).click();
driver.findElement(By.name("email_address")).sendKeys("mogals.fathima@gmail.com");
driver.findElement(By.name("password")).sendKeys("fathima123@");
driver.findElement(By.id("tdb5")).click();
driver.findElement(By.linkText("1ASUSLAPTOP")).click();
driver.findElement(By.id("tdb5")).click();
driver.findElement(By.id("tdb6")).click();
driver.findElement(By.id("tdb6")).click();
WebElement radiobutton=driver.findElement(By.name("payment"));
radiobutton.click();
driver.findElement(By.id("tdb6")).click();
driver.findElement(By.id("tdb5")).click();
WebElement checkbox2=driver.findElement(By.name("notify[]"));
checkbox2.click();
driver.findElement(By.id("tdb5")).click();
driver.findElement(By.id("tdb4")).click();
	}

}
