package pages;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import StepDefinitions.LoginSteps;
import StepDefinitions.TestRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.loginPage;

public class CheckoutPage extends loginPage{

	 private By card_btn = By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']");
	 private By card_btn1 = By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']");
	 private By card_btn2 = By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']");
	 private By checkout_btn = By.xpath("//a[@class='shopping_cart_link']");
	 private By checkout_btn1 = By.xpath("//button[@id='checkout']");
	 private By txt_fname = By.xpath("//input[@id='first-name']");	
	 private By txt_lname = By.xpath("//input[@id='last-name']");
	 private By txt_zip = By.xpath("//input[@id='postal-code']");
	 private By cont_btn = By.xpath("//input[@id='continue']");
	 private By finish_btn = By.xpath("//button[@name='finish']");
	 private By msg = By.xpath("//h2[normalize-space()='Thank you for your order!']");
	
    
	@Test
	public void selected_prod() throws InterruptedException{
		driver.findElement(card_btn).click();
		driver.findElement(card_btn1).click();
		driver.findElement(card_btn2).click();
	}
    @Test
	public void navi_to_shop()
	{
		driver.findElement(checkout_btn).click();
		driver.findElement(checkout_btn1).click();
		
	}
    @Test
	public void shop_form_fill(String fname, String lname, String zip)
	{
		driver.findElement(txt_fname).sendKeys(fname);
		driver.findElement(txt_lname).sendKeys(lname);
		driver.findElement(txt_zip).sendKeys(zip);
		driver.findElement(cont_btn).click();
		driver.findElement(finish_btn).click();
	}
	@Test
	public void validate_shop_isSuccess(String expected)
	{
		String actual = driver.findElement(msg).getText();
		assert actual == expected;
		driver.quit();
	}
}
