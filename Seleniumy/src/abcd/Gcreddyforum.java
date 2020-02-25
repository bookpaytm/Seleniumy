package abcd;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Gcreddyforum {

	public static void main(String[] args) {

		
		
		
System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.gcrit.com/build3/admin/login.php");
driver.findElement(By.name("username")).sendKeys("admin");
driver.findElement(By.name("password")).sendKeys("admin");
driver.findElement(By.id("tdb1")).click();
String errormessage=driver.getCurrentUrl();
if(errormessage.equals("http://www.gcrit.com/build3/admin/index.php")){
	System.out.println("admin login is sucessfully passed");
}
else if(errormessage.equals("Error: Invalid administrator login attempt.")){
	System.out.println("admin login is unsucessfully _but correct error message is showing");
}
else {
	System.out.println("admin login is uncessfully not showing correct error message");
}
	}

}
