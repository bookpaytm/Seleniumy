package abcd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class {

	public static void main(String[] args) {
	
		
System.setProperty("webdriver.chrome.driver", "F://ChromeDriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
String url=driver.getCurrentUrl();
if(url.equals("Google")){
	System.out.println("google is sucessfully_passed");
}
else {
	System.out.println("google is unsucessfully_failed");
}
driver.close();
	}

}
