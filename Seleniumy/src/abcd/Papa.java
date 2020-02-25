package abcd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Papa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
WebDriver  driver=new ChromeDriver();
driver.get("https://www.google.com");
String pagetitle=driver.getCurrentUrl();
if(pagetitle.equals("Google")){
	System.out.println("passed");
}
else {
	System.out.println("failed");
}
	}

}
