package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mogalfacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe") ;
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
driver.get("https://www.facebook.com/");
driver.findElement(By.id("u_0_m")).sendKeys("parveena");
driver.findElement(By.id("u_0_o")).sendKeys("shaik");
driver.findElement(By.id("u_0_r")).sendKeys("shaik.parveena1@gmail.com");
driver.findElement(By.id("u_0_u")).sendKeys("shaik.parveena1@gmail.com");
driver.findElement(By.id("u_0_w")).sendKeys("parveen3456@");
Select dropdown=new Select(driver.findElement(By.id("day")));
dropdown.selectByVisibleText("26");
Select dropdown1=new Select(driver.findElement(By.id("month")));
dropdown1.selectByVisibleText("Jun");
Select dropdown3=new Select(driver.findElement(By.id("year")));
dropdown3.selectByVisibleText("1993");
WebElement radiobutton=driver.findElement(By.id("u_0_7"));
radiobutton.click();
driver.findElement(By.id("u_0_13")).click();
	}

}
