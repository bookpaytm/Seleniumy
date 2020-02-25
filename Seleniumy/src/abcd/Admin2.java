package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Admin2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
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
driver.findElement(By.name("firstname")).sendKeys("saman");
driver.findElement(By.name("lastname")).sendKeys("moghal");
driver.findElement(By.name("dob")).sendKeys("05/09/1990");
driver.findElement(By.name("email_address")).sendKeys("moghal.parveen123@gamil.com");
driver.findElement(By.name("company")).sendKeys("capagemini");
driver.findElement(By.name("street_address")).sendKeys("k.k.pets");
driver.findElement(By.name("suburb")).sendKeys("asdfghjk");
driver.findElement(By.name("postcode")).sendKeys("517174");
driver.findElement(By.name("city")).sendKeys("Hyderabad");
driver.findElement(By.name("state")).sendKeys("Andra pradesh");
Select dropdown=new Select(driver.findElement(By.name("country")));
dropdown.selectByVisibleText("India");
driver.findElement(By.name("telephone")).sendKeys("9087654321");
driver.findElement(By.name("fax")).sendKeys("456789");
WebElement checkbox=driver.findElement(By.name("newsletter"));
checkbox.click();
driver.findElement(By.name("password")).sendKeys("123parveen");
driver.findElement(By.name("confirmation")).sendKeys("123parveen");
driver.findElement(By.id("tdb4")).click();
driver.findElement(By.tagName("h1")).getText();

String pagetitle=driver.getTitle();
if(pagetitle.equals("Your Account Has Been Created!")){
	System.out.println("Gcr shop  is passed");
}
else {
	System.out.println("gcr shop is failed");
}
	
		

	}

}
