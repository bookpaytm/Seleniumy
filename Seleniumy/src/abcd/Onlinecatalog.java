package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Onlinecatalog {

	public static void main(String[] args) {

		

		
System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.gcrit.com/build3/admin/login.php");
driver.findElement(By.linkText("Online Catalog")).click();
String url=driver.getCurrentUrl();
if(url.equals("http://www.gcrit.com/build3/")){
	System.out.println("online catalog is passed");
}
else {
	System.out.println("online catalog is failed");
}

	}

}
