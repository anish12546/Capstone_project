package nopcommerce;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class changeaddress {
	WebDriver driver;
	pageclass pc=new pageclass(driver);
	

@Given("User is logged into their nopCommerce account")
public void user_is_logged_into_their_nop_commerce_account() {
	driver=new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@When("User navigates to the My account section")
public void user_navigates_to_the_my_account_section() {
  pc=new pageclass(driver);
 pc.emai_in();
 pc.pass_in();
 pc.login_btn();
 pc.myaccount_in();
}

@When("User clicks on the Addresses option")
public void user_clicks_on_the_addresses_option() {
    pc=new pageclass(driver);
    pc.address_in();
}

@When("User clicks on Add new or Edit to update an address")
public void user_clicks_on_add_new_or_edit_to_update_an_address() {
    pc=new pageclass(driver);
    pc.edit_in();
}

@When("User enters valid address details")
public void user_enters_valid_address_details() {
    pc=new pageclass(driver);
    pc.new_add();
}

@When("User saves the address")
public void user_saves_the_address() {
    pc=new pageclass(driver);
    pc.select_in();
}

@Then("The address should be updated successfully")
public void the_address_should_be_updated_successfully() {
    driver.close();
}



}
