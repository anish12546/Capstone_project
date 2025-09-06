package nopcommerce;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class add_address {
	
	WebDriver driver;
	pageclass pc=new pageclass(driver);

@Given("User is logged into their nopCommerce accounts")
public void user_is_logged_into_their_nop_commerce_accounts() {
	driver=new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@When("User navigates to the My account sections")
public void user_navigates_to_the_my_account_sections() {
	pc=new pageclass(driver);
	pc.emai_in();
	 pc.pass_in();
	 pc.login_btn();
	 pc.myaccount_in();
}

@When("User clicks on the Addresses")
public void user_clicks_on_the_addresses() {
	 pc=new pageclass(driver);
	    pc.address_in();
}

@When("User clicks on Add new to add a new address")
public void user_clicks_on_add_new_to_add_a_new_address() {
    pc=new pageclass(driver);
    pc.add_btn();
}

@When("User enters valid new address detail")
public void user_enters_valid_new_address_detail() throws InterruptedException {
   pc=new pageclass(driver);
   pc.address_details_in();
}

@When("User saves the addresss")
public void user_saves_the_addresss() {
   pc=new pageclass(driver);
   pc.save_btn_in();
}

@Then("The new address should be added successfully")
public void the_new_address_should_be_added_successfully() {
    driver.close();
}




}
