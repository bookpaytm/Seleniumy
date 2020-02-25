package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Projectwork {

	
	
	
	public static WebDriver driver;
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
driver=new ChromeDriver();
driver.get("http://www.gcrit.com/build3/admin/login.php");
driver.findElement(By.name("username")).sendKeys("admin");
driver.findElement(By.name("password")).sendKeys("admin@123");
driver.findElement(By.id("tdb1")).click();
driver.findElement(By.linkText("Categories/Products")).click();
driver.get("http://www.gcrit.com/build3/admin/categories.php");
//driver.findElement(By.linkText("Edit")).click();
//driver.findElement(By.name("categories_name[1]")).clear();
/*driver.findElement(By.name("categories_name[1]")).sendKeys("Apple");
driver.findElement(By.name("categories_name[1]")).clear();
driver.findElement(By.name("categories_name[1]")).sendKeys("1IPHONE");
driver.findElement(By.name("categories_image")).sendKeys("C:/Users/salman/Pictures/iphone1.png");
driver.findElement(By.id("tdb3")).click();*/
driver.findElement(By.linkText("New Category")).click();
driver.findElement(By.name("categories_name[1]")).sendKeys("1ASUSLAPTOP");
driver.findElement(By.name("categories_image")).sendKeys("C:/Users/salman/Pictures/asuslaptop.png");
driver.findElement(By.id("tdb3")).click();
driver.findElement(By.linkText("New Product")).click();
WebElement radiobutton=driver.findElement(By.name("products_status"));
radiobutton.click();
driver.findElement(By.name("products_date_available")).sendKeys("2019/12/06");

Select dropdown=new Select(driver.findElement(By.name("manufacturers_id")));
dropdown.selectByVisibleText("sony");
driver.findElement(By.name("products_name[1]")).sendKeys("1ASUSLAPTOP");
Select dropdown1=new Select(driver.findElement(By.name("products_tax_class_id")));
dropdown1.selectByVisibleText("Taxable Goods");
driver.findElement(By.name("products_price")).sendKeys("45000");
driver.findElement(By.name("products_price_gross")).sendKeys("40000");
driver.findElement(By.name("products_description[1]")).sendKeys("A product is good quaity is good quantity is good bettary capaticy is high Adapter is avaliable 15.6 inche screen tachpad is available coloue is white colour charging capatict is four hours so totally good product");
driver.findElement(By.name("products_quantity")).sendKeys("100 percent");
driver.findElement(By.name("products_model")).sendKeys("ASUS Zenbook 14 UX433FA");
driver.findElement(By.name("products_image")).sendKeys("C:/Users/salman/Pictures/asuslaptop.png");
driver.findElement(By.name("products_url[1]")).sendKeys("https://www.asuslaptop.com");
driver.findElement(By.name("products_weight")).sendKeys("900grams");
driver.findElement(By.id("tdb1")).click();


	}

}
