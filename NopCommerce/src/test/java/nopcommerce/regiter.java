package nopcommerce;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class regiter {
	WebDriver driver;
	pageclass pc=new pageclass(driver);
	
	
@Given("Register page should be open in default browser")
public void register_page_should_be_open_in_default_browser() {
	driver=new ChromeDriver();
	  driver.get("https://demo.nopcommerce.com/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
}

@When("click on the Register button")
public void click_on_the_register_button() {
	pc=new pageclass(driver);
	pc.register_in();
    
}


@When("^enter valid First Name(.*)$")
public void enter_valid_first_name(String firstname) {
	pc=new pageclass(driver);
	pc.fname_in(firstname);
}

@When("^enter valid Last Name(.*)$")
public void enter_valid_last_name(String lastname) {
	pc=new pageclass(driver);
	pc.lname_in(lastname);
}

@When("^enter valid Email(.*)$")
public void enter_valid_email(String email) {
	pc=new pageclass(driver);
	pc.email_in(email);
}

@When("^enter valid Password(.*)$")
public void enter_valid_password(String password) {
	pc=new pageclass(driver);
	pc.password_in(password);
}

@When("^confirm the Password(.*)$")
public void confirm_the_password(String cpassword) throws InterruptedException {
	pc=new pageclass(driver);
	pc.confirmpassword_in( cpassword);
	pc.register_button();
}



@Then("account should be created successfully")
public void account_should_be_created_successfully() {
	driver.close();
   
}




}
