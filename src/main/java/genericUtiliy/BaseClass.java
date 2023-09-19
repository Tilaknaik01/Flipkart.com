package genericUtiliy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass
{
	public WebDriver driver;
	@Parameters("BROWSER")
	@BeforeTest
	public void beforeclass(String BROWSER)
	{
		if (BROWSER.equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();
		}
		else if (BROWSER.equalsIgnoreCase("firefox")) 
		{
			driver= new FirefoxDriver();
		}
	}
}
