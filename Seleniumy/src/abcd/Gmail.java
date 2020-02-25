package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) {
		
		
		
		
		
System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("Https://www.google.com");
driver.findElement(By.linkText("Gmail")).click();
driver.get("https://accounts.google.com/signup/v2/webcreateaccount?continue=https%3A%2F%2Faccounts.google.com%2F&dsh=S-133413370%3A1574669850919626&gmb=exp&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
driver.findElement(By.name("firstName")).sendKeys("salmana");
driver.findElement(By.name("lastName")).sendKeys("mogala");
driver.findElement(By.name("Username")).sendKeys("shabbu.moghal@gmail.com");
driver.findElement(By.name("Passwd")).sendKeys("shabbu123!");
driver.findElement(By.name("ConfirmPasswd")).sendKeys("shabbu123!");
driver.findElement(By.id("accountDetailsNext")).click();


	}

}
