package StepDefinitions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.CheckoutPage;
import pages.loginPage;


public class LoginSteps {
	WebDriver driver;
	loginPage login;
	CheckoutPage chk = new CheckoutPage();
	
	@Given("WEB is open")
	public void user_is_on_login_page(){
		if(!(driver.getCurrentUrl() == "https://www.saucedemo.com/")) {
			throw new IllegalStateException("Web is not correctly opened");
		}
	}
	
	@When("^user enters (.*) and (.*)$")
	public void user_login(String username, String password) throws InterruptedException {
		login.Loginwithuser(username, password);
		chk.selected_prod();
	}
	
	@Then("validate user is navigated to page")
	public void login_validate(String expected) throws InterruptedException {
		login.validate_login(expected);
	}
}
