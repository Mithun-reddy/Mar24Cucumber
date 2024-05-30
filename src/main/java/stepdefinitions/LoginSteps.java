package stepdefinitions;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;
import pages.LoginPage;
import utils.DataUtils;

public class LoginSteps {
	static WebDriver driver;
	static LoginPage lp;
	
	@Before
	public void setup() {
		System.out.println("setting up ...");
	}
	
	@After
	public void tearDown() {
		System.out.println("tearDown  ...");
	}
	
	@BeforeAll
	public static void before_or_after_all() {
		driver = new ChromeDriver();
		lp = new LoginPage(driver);
	}
	
	@BeforeStep
	public void before_step() {
		System.out.println("before steps . . . . .");
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

	@When("user click(s) on login button")
	public void user_clicks_on_login_button() {
//		lp.loginButton.click();
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
	
	@When("user enters email {string}")
	public void user_enters_email(String email) {
		System.out.println(email);
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("user enters password as {string}")
	public void user_enters_password_as(String pass) {
		System.out.println(pass);
	    // Write code here that turns the phrase above into concrete actions
//		lp.password.sendKeys(pass.toString());
	}
	
	@When("user creates accounts")
	public void user_creates_accounts() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("user should see accounts created")
	public void user_should_see_accounts_created(DataTable dataTable) {
		List<String> accntName = dataTable.asList();
		for (String s: accntName) {
			System.out.println(s);
		}
	}



}
