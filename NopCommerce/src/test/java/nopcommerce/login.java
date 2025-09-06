package nopcommerce;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
	WebDriver driver;
	pageclass pc=new pageclass(driver);
	

@Given("Login page should be open in default browser")
public void login_page_should_be_open_in_default_browser() {
	driver=new ChromeDriver();
	  driver.get("https://demo.nopcommerce.com/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@When("user enters valid Email address")
public void user_enters_valid_email_address() {
    pc=new pageclass(driver);
    pc.emai_in();
}

@When("user enters valid Password")
public void user_enters_valid_password() {
   pc=new pageclass(driver);
   pc.pass_in();
}

@When("user clicks on the Login button")
public void user_clicks_on_the_login_button() {
    pc=new pageclass(driver);
    pc.login_btn();
}

@Then("user should be logged in and redirected to the homepage")
public void user_should_be_logged_in_and_redirected_to_the_homepage() {
    driver.close();
}




}
