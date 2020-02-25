package abcd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Testcase1 {

	public static void main(String[] args) {
		
		
		
		
System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 Loginpage login=PageFactory.initElements(driver, Loginpage.class);
 driver.get("http://www.gcrit.com/build3/admin/login.php");
 login.testcase("admin", "admin@123");
String url=driver.getCurrentUrl();
if(url.equals("http://www.gcrit.com/build3/admin/index.php")){
	System.out.println("admin login is sucessfully_passed");
}
else {
	System.out.println("failed");
}
driver.close();
	}

}
