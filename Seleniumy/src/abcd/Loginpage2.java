package abcd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage2 {

	
	
	
	
	
	public WebDriver driver;
	public Loginpage2(WebDriver driver){
		this.driver=driver;
	}
@FindBy(name="username") WebElement user;
@FindBy(name="password") WebElement pass;
@FindBy(name="tdb1") WebElement button;	
	public void testcase(String uname,String upass){
		user.sendKeys(uname);
		pass.sendKeys(upass);
		button.click();
	}
	
	
	
	
	
}
