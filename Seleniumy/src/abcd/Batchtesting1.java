package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Batchtesting1 {

	
	
	
	
	
	
	public static WebDriver driver;
	//launch browser
public void launchbrowser(){
	System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
	driver=new ChromeDriver();
}
//closebrowser
public void closebrowser(){
	driver.close();
}
	//adminlogin
public void adminlogin(String uname,String upwd){
	driver.get("http://www.gcrit.com/build3/admin/login.php");
	driver.findElement(By.name("username")).sendKeys(uname);
	driver.findElement(By.name("password")).sendKeys(upwd);
	driver.findElement(By.id("tdb1")).click();
}
	
public static void main(String[] args) {
Batchtesting1 obj=new Batchtesting1();
//Admin login is functionlity
obj.launchbrowser();
obj.adminlogin("admin","admin@123");
String page=driver.getCurrentUrl();
if(page.equals("http://www.gcrit.com/build3/admin/index.php")){
	System.out.println("admin login is sucessfully_passed");
}
else {
	System.out.println("admin login is unsucessfully_failed");
}
obj.closebrowser();
//testcase2:error message
obj.launchbrowser();
obj.adminlogin("admin", "admin123");
String errormessage=driver.findElement(By.className("messageStackError")).getText();
if(errormessage.equals("Error: Invalid administrator login attempt.")){
	System.out.println("admin login is sucessfully_errormessageis showing");
}
else{
	System.out.println("admin login is unsucessfully_errormessage is not showing");
	
	
}
obj.closebrowser();
//redirect functionality
obj.launchbrowser();
obj.adminlogin("admin", "admin@123");
driver.findElement(By.linkText("Online Catalog")).click();
String page1=driver.getCurrentUrl();
if(page1.equals("http://www.gcrit.com/build3/admin/index.php")){
System.out.println("admin login is passed");
	}
else {
	System.out.println("admin login is unsucessfully_failed");
}
obj.closebrowser();
}
}