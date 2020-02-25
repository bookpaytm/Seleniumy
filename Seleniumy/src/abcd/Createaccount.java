package abcd;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Createaccount {

	public static void main(String[] args) {

		
		
		
System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.gcrit.com/build3/admin/login.php");
driver.findElement(By.name("username")).sendKeys("admin");
driver.findElement(By.name("password")).sendKeys("admin@123");
driver.findElement(By.id("tdb1")).click();
driver.findElement(By.linkText("Online Catalog")).click();
driver.findElement(By.linkText("create an account")).click();
WebElement radiobutton=driver.findElement(By.name("gender"));
radiobutton.click();
driver.findElement(By.name("firstname")).sendKeys("fathima");
driver.findElement(By.name("lastname")).sendKeys("mogals");
driver.findElement(By.name("dob")).sendKeys("05/09/1990");
driver.findElement(By.name("email_address")).sendKeys("mogals.fathima@gmail.com");
driver.findElement(By.name("company")).sendKeys("microsoft");
driver.findElement(By.name("street_address")).sendKeys("kkpeta");
driver.findElement(By.name("suburb")).sendKeys("wertyui");
driver.findElement(By.name("postcode")).sendKeys("345678");
driver.findElement(By.name("city")).sendKeys("hyderabad");
driver.findElement(By.name("state")).sendKeys("andra pradesh");
Select dropdown=new Select(driver.findElement(By.name("country")));
dropdown.selectByVisibleText("India");
driver.findElement(By.name("telephone")).sendKeys("9876543210");
driver.findElement(By.name("fax")).sendKeys("789012");
WebElement checkbox=driver.findElement(By.name("newsletter"));
checkbox.click();
driver.findElement(By.name("password")).sendKeys("fathima123@");
driver.findElement(By.name("confirmation")).sendKeys("fathima123@");
driver.findElement(By.id("tdb4")).click();
driver.findElement(By.tagName("h1")).getText();

String message=driver.getTitle();
if(message.equals("Your Account Has Been Created!")){
	System.out.println("create an account link is passed");
}
else {
	System.out.println("create an account is failed");
}

	}

}
