package StepDefinitions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.loginPage;
import pages.CheckoutPage;

public class CheckoutSteps{

	static WebDriver driver;
	loginPage login = new loginPage();
	CheckoutPage chkout = new CheckoutPage();

	@Given("^products is selected by (.*) and (.*)$")
	public void selected_products(String username, String paswword) throws InterruptedException{
		login.Loginwithuser(username, paswword);
		chkout.selected_prod();
		
	}
	@When("user clicks on checkout button")
	public void user_login() throws InterruptedException {
		chkout.navi_to_shop();		
	}
	@And("^user fill form (.*) (.*) (.*)$")
	public void form_fill(String fname, String lname, String zip) throws InterruptedException {
		chkout.shop_form_fill(fname, lname, zip);
	}
	
	@Then("^user finish shopping with sucess msg (.*)$")
	public void validate_shop(String expected) throws InterruptedException {
		chkout.validate_shop_isSuccess(expected);
		
	}

}
