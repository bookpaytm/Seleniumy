package abcd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Model {

	public static void main(String[] args) {

		
		
System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
WebDriver driver=new ChromeDriver();
Pageobject login=PageFactory.initElements(driver, Pageobject.class);
driver.get("http://www.gcrit.com/build3/admin/login.php");
login.model("admin", "admin@123");
String url=driver.getCurrentUrl();
if(url.equals("http://www.gcrit.com/build3/admin/index.php")){
	System.out.println("passed");
}
else{
	System.out.println("failed");
}

	}

}
