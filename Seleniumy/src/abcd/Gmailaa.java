package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmailaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
driver.findElement(By.linkText("Gmail")).click();

driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Fpc%3Dtopnav-about-n-en&flowName=GlifWebSignIn&flowEntry=SignUp");
driver.findElement(By.name("firstName")).sendKeys("shahina");
driver.findElement(By.name("lastName")).sendKeys("moghals");
driver.findElement(By.name("Username")).sendKeys("5674shahina@gmail.com");
driver.findElement(By.name("Passwd")).sendKeys("7890shahina!");
driver.findElement(By.name("ConfirmPasswd")).sendKeys("7890shahina!");
driver.findElement(By.id("accountDetailsNext")).click();
	}

}
