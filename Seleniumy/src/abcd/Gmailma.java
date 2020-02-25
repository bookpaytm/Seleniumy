package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmailma {

	public static void main(String[] args) {

		
		
System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
driver.findElement(By.linkText("Gmail")).click();
driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Dwm%26ogbl&ltmpl=default&gmb=exp&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
driver.findElement(By.name("firstName")).sendKeys("shabana");
driver.findElement(By.name("lastName")).sendKeys("moghal");
driver.findElement(By.name("Username")).sendKeys("mogal.1234sabana@gmail.com");
driver.findElement(By.name("Passwd")).sendKeys("shabana123!");
driver.findElement(By.name("ConfirmPasswd")).sendKeys("shabana123!");
driver.findElement(By.id("accountDetailsNext")).click();
	}

}
