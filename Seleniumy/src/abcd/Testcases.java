package abcd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Testcases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
WebDriver driver=new ChromeDriver();
Loginpage login=PageFactory.initElements(driver, Loginpage.class);
driver.get("http://www.gcrit.com/build3/admin/login.php");
login.testcase("admin", "admin@123");
	}

}
