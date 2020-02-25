package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {

		
		
		
System.setProperty("webdriver.chrome.driver", "F:chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.gcrit.com/build3/admin/login.php");
driver.findElement(By.linkText("Online Catalog")).click();
driver.findElement(By.linkText("login")).click();
driver.findElement(By.name("email_address")).sendKeys("mogals.fathima@gmail.com");
driver.findElement(By.name("password")).sendKeys("fathima123@");
driver.findElement(By.id("tdb5")).click();
driver.findElement(By.id("tdb4")).click();

	}

}
