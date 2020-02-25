package abcd;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datadriven12 {
public static WebDriver driver;

	public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
FileReader f=new FileReader("C:/Users/salman/Desktop/salman1.txt");
BufferedReader br=new BufferedReader(f);
int a=0;
int b=0;
String line;
while((line=br.readLine())!=null){
a=a+1;
b=b+1;
if(a>0){
String[]inputs=line.split(",",2);
driver=new ChromeDriver();
driver.get("http://www.gcrit.com/build3/admin/login.php");
driver.findElement(By.name("username")).sendKeys(inputs[0]);
driver.findElement(By.name("password")).sendKeys(inputs[1]);
driver.findElement(By.id("tdb1")).click();
String url=driver.getCurrentUrl();
if(url.equals("http://www.gcrit.com/build3/admin/index.php")){
System.out.println("admin login is successful-passed");
}
else{
	System.out.println("admin login is unsuccessful-failed");
}
driver.close();
}
}
br.close();
f.close();

	}

}
