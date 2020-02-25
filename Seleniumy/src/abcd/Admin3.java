package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Admin3 {

	public static void main(String[] args) {

		
		
		
		
System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.gcrit.com/build3/login.php");
driver.findElement(By.name("email_address")).sendKeys("mogal.samana@gmail.com");
driver.findElement(By.name("password")).sendKeys("samana");
driver.findElement(By.id("tdb6")).click();

	}

}
