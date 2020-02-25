package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Batchtesting12 {
	
	
	
	
	
public static WebDriver driver;
//launchbrowser
public void launchBrowser(){
System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
driver=new ChromeDriver();
}
//closeBrowser
public void CloseBrowser(){
driver.close();
}
//adminlogin
public void adminlogin(String Uname,String pwd){
	driver.get("http://www.gcrit.com/build3/admin/login.php");
	driver.findElement(By.name("username")).sendKeys(Uname);
	driver.findElement(By.name("password")).sendKeys(pwd);
	driver.findElement(By.id("tdb1")).click();
}
public static void main(String[] args) {
Batchtesting12 obj=new Batchtesting12();
//adminlogin is functionality
obj.launchBrowser();
obj.adminlogin("admin", "admin@123");
String url=driver.getCurrentUrl();
if(url.equals("http://www.gcrit.com/build3/admin/index.php")){
System.out.println("passed");
}
else{
	System.out.println("failed");
}
obj.CloseBrowser();;
//adminlogin is errormessage
obj.launchBrowser();;
obj.adminlogin("admin1", "admin@123");
String Errormessage=driver.findElement(By.className("messageStackError")).getText();
if(Errormessage.contains("Error: Invalid administrator login attempt.")){
	System.out.println("passed");
}
else{
System.out.println("failed");

}
obj.CloseBrowser();;
//adminlogin is redirectory functionality
obj.launchBrowser();;
obj.adminlogin("admin", "admin@123");
driver.findElement(By.linkText("Online Catalog")).click();
String url1=driver.getCurrentUrl();
if(url1.equals("http://www.gcrit.com/build3/")){
System.out.println("passed");
}
else{
System.out.println("failed");
}
obj.CloseBrowser();;
	

	}

}
