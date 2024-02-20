package pages;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import StepDefinitions.TestRunner;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class loginPage {
	public static WebDriver driver;

	static String Url = "https://www.saucedemo.com/";
	private By txt_username = By.xpath("//input[@placeholder='Username']");
	private By txt_password = By.xpath("//input[@placeholder='Password']");
	private By login_btn = By.xpath("//input[@name='login-button']");	
	private By inventory = By.xpath("//span[normalize-space()='Products']");


	public static void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.get(Url);
		driver.manage().window().maximize();
	}
	@Test	    
	public void Loginwithuser(String username, String password)
	{
		openBrowser();
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(login_btn).click();
	}
	@Test
	public void validate_login(String expected)
	{
		String actual_val = driver.findElement(inventory).getText();
		assert actual_val == expected;
	}
	
}



