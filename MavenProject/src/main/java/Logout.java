

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout {
	WebDriver driver=null;
	By logOut = By.linkText("Log Out");
	
	public Logout(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickOnLogOut()
	{
		driver.findElement(logOut).click();
	}

}
