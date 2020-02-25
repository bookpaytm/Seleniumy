package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Batchtesting {

 static WebDriver driver;

//launch browser;
public void launchbrowser(){
System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
driver=new ChromeDriver();
}
//closeBrowser
public void closebrowser(){
	driver.close();
}
//admin login
public  void adminlogin(String uname,String upwd){
	driver.get("http://www.gcrit.com/build3/admin/login.php");
driver.findElement(By.name("username")).sendKeys(uname);
driver.findElement(By.name("password")).sendKeys(upwd);
driver.findElement(By.id("tdb1")).click();
}
	
public static void main(String[] args) {
Batchtesting obj=new Batchtesting();
//verify admin login is functionality
obj.launchbrowser();
obj.adminlogin("admin", "admin@123");
String url=driver.getCurrentUrl();
if(url.equals("http://www.gcrit.com/build3/admin/index.php")){
System.out.println("successful");
}
else{
System.out.println("failed");
}
obj.closebrowser();
//verify errormessage
obj.launchbrowser();
obj.adminlogin("admin1", "admin@123");
String errormessage=driver.findElement(By.className("messageStackError")).getText();
if(errormessage.contains("Error: Invalid administrator login attempt.")){
System.out.println("errormessage is successful");
}
else{
	System.out.println("errormessage is successful");
}
obj.closebrowser();
//verify redirectory functionality
obj.launchbrowser();
obj.adminlogin("admin", "admin@123");
driver.findElement(By.linkText("Online Catalog")).click();
String url1=driver.getCurrentUrl();
if(url1.equals("http://www.gcrit.com/build3/")){
System.out.println("successful");
}
else{
	System.out.println("unsuccessful");
}
obj.closebrowser();



	}

}
