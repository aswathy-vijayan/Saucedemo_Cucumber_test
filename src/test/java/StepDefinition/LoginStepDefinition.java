package StepDefinition;

import java.time.Duration;

import org.ictkerala.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	WebDriver driver;
	LoginPage obj;

	@Before
	public void setup() {
		driver = new ChromeDriver();
	}

	@Given("I am in the sauce demo website")
	public void i_am_in_the_sauce_demo_website() {
		// Write code here that turns the phrase above into concrete actions
		obj = new LoginPage(driver);
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Given("I have entered invalid test and test1")
	public void i_have_entered_invalid_test_and_test1() {
		//write code here that turns the phrase above into concrete action
		obj.setUsername("invalid_username");
		obj.setPass("invalid_password");
		obj.butnClick();
	}
	@When("I click on login button")
	public void i_click_on_login_button() {
		// Write code here that turns the phrase above into concrete actions
		obj.butnClick();
	}
	@Then("I should get an error message Epic sadface: Username and password do not match any user in this service")
	public void i_should_get_an_error_message_epic_sadface_username_and_password_do_not_match_any_user_in_this_service() {
		//Write code that turns the phrase above into concrete actions
		System.out.println("Login failed");
	}	
	
	
	@Given("I have entered valid username and password")
	public void i_have_entered_valid_username_and_password() {
		// Write code here that turns the phrase above into concrete actions
		obj.setUsername("standard_user");
		obj.setPass("secret_sauce");
	}

	@Then("I successfully logged into the page")
	public void i_successfully_logged_into_the_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("successfully logged in");
	}
	
}
