package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Customers {
	
	
	
	
	
public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.gcrit.com/build3/admin/login.php");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.id("tdb1")).click();
		driver.findElement(By.linkText("Customers")).click();
		driver.get("http://www.gcrit.com/build3/admin/customers.php");
		driver.findElement(By.linkText("Edit")).click();
WebElement radiobutton=driver.findElement(By.name("customers_gender"));
	radiobutton.click();
	driver.findElement(By.name("customers_firstname")).clear();
	driver.findElement(By.name("customers_firstname")).sendKeys("salman");
	driver.findElement(By.name("customers_lastname")).clear();
	driver.findElement(By.name("customers_lastname")).sendKeys("mogal");
	driver.findElement(By.name("customers_dob")).clear();
	driver.findElement(By.name("customers_dob")).sendKeys("05/09/1990");
	driver.findElement(By.name("customers_email_address")).clear();
	driver.findElement(By.name("customers_email_address")).sendKeys("mogal.salmana@gmail.com");
	driver.findElement(By.name("entry_company")).clear();
	driver.findElement(By.name("entry_company")).sendKeys("Google");
	driver.findElement(By.name("entry_street_address")).clear();
	driver.findElement(By.name("entry_street_address")).sendKeys("begumpet");
	driver.findElement(By.name("entry_suburb")).clear();
	driver.findElement(By.name("entry_suburb")).sendKeys("asdfghjkll");
	driver.findElement(By.name("entry_postcode")).clear();
	
	driver.findElement(By.name("entry_postcode")).sendKeys("23456789");
	driver.findElement(By.name("entry_city")).clear();
	driver.findElement(By.name("entry_city")).sendKeys("hyderabad");
	driver.findElement(By.name("entry_state")).clear();
	driver.findElement(By.name("entry_state")).sendKeys("Telangana");
// dropdown3=new Select(driver.findElement(By.name("entry_country_id")));
//dropdown3.selectByIndex("Kazakhstan");
Select dropdown2=new Select(driver.findElement(By.name("entry_country_id")));
dropdown2.selectByVisibleText("Kazakhstan");
driver.findElement(By.name("customers_telephone")).clear();
driver.findElement(By.name("customers_telephone")).sendKeys("9012345678");
driver.findElement(By.name("customers_fax")).clear();
driver.findElement(By.name("customers_fax")).sendKeys("234567890");
Select dropdown4=new Select(driver.findElement(By.name("customers_newsletter")));
dropdown4.selectByVisibleText("Unsubscribed");
driver.findElement(By.id("tdb1")).click();

	
	
	
	
	
	
	
	
	
	
	}

}
