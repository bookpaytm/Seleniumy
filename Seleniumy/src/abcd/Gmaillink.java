package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmaillink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
driver.findElement(By.linkText("Gmail")).click();
driver.get("https://accounts.google.com/");
//driver.findElement(By.linkText("Use another account")).click();
//driver.get("https://accounts.google.com/signin/v2/identifier?passive=1209600&continue=https%3A%2F%2Faccounts.google.com%2F&followup=https%3A%2F%2Faccounts.google.com%2F&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
//driver.findElement(By.linkText("Create account")).click();
//driver.findElement(By.linkText("For myself")).click();
driver.get("https://accounts.google.com/signup/v2/webcreateaccount?continue=https%3A%2F%2Faccounts.google.com%2F&dsh=S-133413370%3A1574669850919626&gmb=exp&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
driver.findElement(By.name("firstName")).sendKeys("Salman");
driver.findElement(By.name("lastName")).sendKeys("mogal");



}
}

