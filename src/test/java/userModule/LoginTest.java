package userModule;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericUtiliy.BaseClass;
import objectRepositories.LoginPage;

public class LoginTest extends BaseClass
{
	@Test
	public void fb()
	{
		LoginPage login = new LoginPage(driver);
		login.logindata();


		

		
		
	}
}
