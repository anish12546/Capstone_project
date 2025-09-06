package nopcommerce;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class wishlist {
	WebDriver driver;
	pageclass pc=new pageclass(driver);
	

@Given("user is on the product page in default browsers")
public void user_is_on_the_product_page_in_default_browsers() {
	driver=new ChromeDriver();
	  driver.get("https://demo.nopcommerce.com/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@When("user clicks on Add to wishlist button")
public void user_clicks_on_add_to_wishlist_button() throws InterruptedException {
    pc=new pageclass(driver);
    driver.get("http://demo.nopcommerce.com/electronics");
    pc.wishlist_in();
    
}

@When("user clicks on Wishlist button")
public void user_clicks_on_wishlist_button() throws InterruptedException {
    pc.show_w_in();
}

@When("user clicks on wishlist Remove button")
public void user_clicks_on_wishlist_remove_button() throws InterruptedException {
    pc=new pageclass(driver);
    pc.remove_w_in();
}

@Then("product should be added and removed from the wishlist")
public void product_should_be_added_and_removed_from_the_wishlist() {
    driver.close();
}




}
