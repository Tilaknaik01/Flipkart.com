package objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class LoginPage {
	
	@FindBy(xpath = "//input[@id='email']") private WebElement un;
	
	@FindBy(xpath = "//input[@id='pass']") private WebElement pwd;

	@FindBy(xpath = "//button[@name='login']") private WebElement loginbtn;

	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getUn() {
		return un;
	}

	public void setUn(WebElement un) {
		this.un = un;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public void setPwd(WebElement pwd) {
		this.pwd = pwd;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public void setLoginbtn(WebElement loginbtn) {
		this.loginbtn = loginbtn;
	}
	
	
	public void logindata()
	{
		un.sendKeys("admin");
		pwd.sendKeys("admin");
		loginbtn.click();
	}

	
}
