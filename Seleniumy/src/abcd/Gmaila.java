package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmaila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
System.setProperty("webdriver,chrome.driver", "F:/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
driver.findElement(By.linkText("Gmail")).click();
	}

}
