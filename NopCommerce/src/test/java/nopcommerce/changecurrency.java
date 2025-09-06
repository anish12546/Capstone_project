package nopcommerce;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class changecurrency {
	WebDriver driver;
	pageclass pc=new pageclass(driver);
	

@Given("Homepage should be open in default browser")
public void homepage_should_be_open_in_default_browser() {
	driver=new ChromeDriver();
	  driver.get("https://demo.nopcommerce.com/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@When("user selects Euro from the currency dropdown")
public void user_selects_euro_from_the_currency_dropdown() throws InterruptedException {
	pc=new pageclass(driver);
	pc.product_category();
	
	pc.change_currency();
	
    
}

@Then("all product prices should be displayed in €")
public void all_product_prices_should_be_displayed_in_€() {
	driver.close();
    
}




}
