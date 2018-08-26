package crossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VerifyTitle {

	WebDriver driver;

	@Test
	@Parameters("browser")
	public void verifyTitle(String browserName) {
		
		if (browserName.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
		} 
		else if(browserName.equalsIgnoreCase("firefox"))
		{

			System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver-v0.21.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org/");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
