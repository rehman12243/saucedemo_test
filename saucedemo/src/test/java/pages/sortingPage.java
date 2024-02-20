package pages;

import org.junit.Test;
import org.openqa.selenium.By;

public class sortingPage extends loginPage{

	 private By drpdown = By.xpath("//span[@class='select_container']");
	 private By lowprice_box = By.xpath("//option[@value='lohi']");
	 private By highprice_box = By.xpath("//option[@value='hilo']");
	 private By card_btn2 = By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']");
	 private By toggle = By.xpath("//button[@id='react-burger-menu-btn']");
	 private By logout_btn = By.xpath("//a[@id='logout_sidebar_link']");
	 private By logo = By.xpath("//div[@class='login_logo']");	
	
   
	@Test
	public void sorting_prod() throws InterruptedException{
		driver.findElement(drpdown).click();
		driver.findElement(lowprice_box).click();
		driver.findElement(drpdown).click();
		driver.findElement(highprice_box).click();

	}
   @Test
	public void chk_logout()
	{
		driver.findElement(toggle).click();
		driver.findElement(logout_btn).isDisplayed();
	}
   @Test
	public void logout()
	{
	   driver.findElement(logout_btn).click();
	   driver.findElement(logo).isDisplayed();
	   driver.quit();
	   
	}

}