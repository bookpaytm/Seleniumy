package abcd;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriverdatadriven {
	
	
	
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {

		
		
System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
FileReader src=new FileReader("C:/Users/salman/Desktop/datadriven.txt");
BufferedReader br=new BufferedReader(src);
int a=0;
int b=0;
String line;
while((line=br.readLine())!=null){
a=a+1;
b=b+1;
if(a>0){
String [] input=line.split(",",2);
driver=new ChromeDriver();
driver.get("http://www.gcrit.com/build3/admin/login.php");
driver.findElement(By.name("username")).sendKeys(input[0]);
driver.findElement(By.name("password")).sendKeys(input[1]);
driver.findElement(By.id("tdb1")).click();
String url=driver.getCurrentUrl();
if(url.contains("http://www.gcrit.com/build3/admin/index.php")){
	System.out.println("admin login is sucessfully_passed");
}
else {
	System.out.println("admin login is unsucessfully_failed");
}
driver.close();
	}
}
	br.close();
	src.close();



	}

}
