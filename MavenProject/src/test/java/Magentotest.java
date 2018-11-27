import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Magentotest {
	
	@Test
	public void posCredentials() throws InterruptedException {
		WebDriver driver = new FirefoxDriver
				();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String url = "https://www.magento.com";
		driver.get(url);
		Main m = new Main(driver);
		m.clickOnMyAcct();
		Login l = new Login(driver);
		l.sendEmail("darshilpatel7698@gmail.com");
		l.sendPassword("Ddp7698416244");
		l.clickLogin();
		Logout logout = new Logout(driver);
		logout.clickOnLogOut();
		Thread.sleep(5000);
		driver.quit();

	}

}
