

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Main {
	WebDriver driver = null;
	By myacct = By.linkText("My Account");
	
	public Main(WebDriver driver)
	{
		this.driver = driver;
	}
	public void clickOnMyAcct()
	{
		driver.findElement(myacct).click();
	}

}
