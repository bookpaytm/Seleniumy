package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dataprogram {

	public static void main(String[] args) {

		
		
		
System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.gcrit.com/build3/admin/login.php");
driver.findElement(By.name("username")).sendKeys("admin");
driver.findElement(By.name("password")).sendKeys("admin@123");
driver.findElement(By.id("tdb1")).click();
driver.findElement(By.linkText("Online Catalog")).click();
driver.findElement(By.linkText("login")).click();
driver.findElement(By.name("email_address")).sendKeys("mogal.samana@gmail.com");
driver.findElement(By.name("password")).sendKeys("samana");
driver.findElement(By.id("tdb5")).click();
driver.findElement(By.linkText("new products")).click();


String pagetitle=driver.getCurrentUrl();
if(pagetitle.equals("http://www.gcrit.com/build3/admin/index.php")){
	System.out.println("passed");
}
else
{
	System.out.println("failed");
}

	}

}
