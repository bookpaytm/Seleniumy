package abcd;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Webdrivercatalog {
	
	
	
	
	
	
public static WebDriver driver;
	public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
FileReader src=new FileReader("C:/Users/salman/Desktop/webdriver.txt");
BufferedReader br=new BufferedReader(src);
int a=0;
int b=0;
String line;
while((line=br.readLine())!=null){
	a=a+1;
	b=b+1;
	if(a>0){
	String [] input=line.split("," ,17);
	driver=new ChromeDriver();
driver.get("http://www.gcrit.com/build3/admin/login.php");
driver.findElement(By.name("username")).sendKeys("admin");
driver.findElement(By.name("password")).sendKeys("admin@123");
driver.findElement(By.id("tdb1")).click();
driver.findElement(By.linkText("Online Catalog")).click();
driver.findElement(By.linkText("create an account")).click();

WebElement radiobutton=driver.findElement(By.name(input[0]));
radiobutton.click();
driver.findElement(By.name("firstname")).sendKeys(input[1]);
driver.findElement(By.name("lastname")).sendKeys(input[2]);
driver.findElement(By.name("dob")).sendKeys(input[3]);
driver.findElement(By.name("email_address")).sendKeys(input[4]);	
driver.findElement(By.name("company")).sendKeys(input[5]);	
driver.findElement(By.name("street_address")).sendKeys(input[6]);
driver.findElement(By.name("suburb")).sendKeys(input[7]);
driver.findElement(By.name("postcode")).sendKeys(input[8]);
driver.findElement(By.name("city")).sendKeys(input[9]);
driver.findElement(By.name("state")).sendKeys(input[10]);
Select dropdown=new Select(driver.findElement(By.name("country")));
dropdown.selectByVisibleText(input[11]);
driver.findElement(By.name("telephone")).sendKeys(input[12]);
driver.findElement(By.name("fax")).sendKeys(input[13]);
WebElement checkbox=driver.findElement(By.name(input[14]));
checkbox.click();
driver.findElement(By.name("password")).sendKeys(input[15]);
driver.findElement(By.name("confirmation")).sendKeys(input[16]);
driver.findElement(By.id("tdb4")).click();
String url=driver.getCurrentUrl();
if(url.contains("http://www.gcrit.com/build3/create_account.php")){
System.out.println("create ana account is sucessfully_passed");
}
else
{
	System.out.println("create ana account is unsucessfully_failed");
}
driver.close();
}
	
}
br.close();
src.close();

	}
}


