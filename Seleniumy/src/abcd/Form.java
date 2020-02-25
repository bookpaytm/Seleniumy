package abcd;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {
	
	
	
	
	
	

public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://ysrrythubharosa.ap.gov.in/RBApp/Reports/PaymentStatus");
driver.findElement(By.className("form-control")).sendKeys("606281345512");
System.out.println("enter captcha");
Scanner scan=new Scanner(System.in);
String captcha=scan.nextLine();
driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/div[2]/div/input")).sendKeys(captcha);
driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/div[3]/input")).click();

	}

}
