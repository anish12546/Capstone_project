package nopcommerce;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class compareTo {
	WebDriver driver;
	pageclass pc=new pageclass(driver);
	

@Given("User is on the nopCommerce homepage")
public void user_is_on_the_nop_commerce_homepage() {
		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@When("User clicks on the Compare button for the first product")
public void user_clicks_on_the_compare_button_for_the_first_product() throws InterruptedException {
    pc=new pageclass(driver);
    pc.product_category();
    pc.first_product_in();
}

@When("User clicks on the Compare button for the second product")
public void user_clicks_on_the_compare_button_for_the_second_product() throws InterruptedException {
    pc.second_product_in();
}

@When("User navigates to the product comparison page")
public void user_navigates_to_the_product_comparison_page() throws InterruptedException {
    pc.comapre_in();
}

@Then("Both selected products should be displayed in the comparison list")
public void both_selected_products_should_be_displayed_in_the_comparison_list() {
    driver.close();
}




}
