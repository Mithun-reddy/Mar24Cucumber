package stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.*;
import pages.LoginPage;
import utils.DataUtils;

public class LoginSteps {
	static WebDriver driver;
	static LoginPage lp;
	
	@BeforeAll
	public static void before_or_after_all() {
		driver = new ChromeDriver();
		lp = new LoginPage(driver);
	}
	
	@Given("user launched login page")
	public void user_launched_login_page() throws IOException {
		driver.get(DataUtils.readLoginTestData("app.url"));
	}

	@When("user enters valid username")
	public void user_enters_valid_username() throws IOException {
		lp.username.sendKeys(DataUtils.readLoginTestData("valid.username"));
	}

	@When("user enters valid password")
	public void user_enters_valid_password() throws IOException {
		lp.password.sendKeys(DataUtils.readLoginTestData("valid.password"));
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		lp.loginButton.click();
	}

	@Then("user should be seeing home page")
	public void user_should_be_seeing_home_page() {
	}

	@When("user enters invalid username")
	public void user_enters_invalid_username() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}

	@When("user enters invalid password")
	public void user_enters_invalid_password() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}

	@When("user enters ivalid password")
	public void user_enters_ivalid_password() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}


}
