package StepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CheckoutPage;
import pages.loginPage;
import pages.sortingPage;

public class sortingSteps {
	
	static WebDriver driver;
	loginPage login = new loginPage();
	sortingPage sort = new sortingPage();

	@Given("^sorting price with price range (.*) (.*)$")
	public void selected_products(String username, String paswword) throws InterruptedException{
		login.Loginwithuser(username, paswword);
		sort.sorting_prod();
		
	}
	@And("check logout button is visible")
	public void form_fill() throws InterruptedException {
		sort.chk_logout();
	}
	
	@Then("logout and validate user logout")
	public void validate_shop() throws InterruptedException {
		sort.logout();
		
	}


}
