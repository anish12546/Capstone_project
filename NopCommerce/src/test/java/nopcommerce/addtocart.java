package nopcommerce;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addtocart {
	WebDriver driver;
	pageclass pc=new pageclass(driver);
	

@Given("user is on the product page in default browser")
public void user_is_on_the_product_page_in_default_browser() {
	driver=new ChromeDriver();
	  driver.get("https://demo.nopcommerce.com/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@When("user clicks on Add to cart button")
public void user_clicks_on_add_to_cart_button() throws InterruptedException {
    pc=new pageclass(driver);
	driver.get("http://demo.nopcommerce.com/electronics");
    pc.add_to_cart_in();
}

@When("user clicks on Shopping cart button")
public void user_clicks_on_shopping_cart_button() throws InterruptedException {
	pc=new pageclass(driver);
	pc.show_in();
}

@When("user clicks on Remove button")
public void user_clicks_on_remove_button() throws InterruptedException {
	pc=new pageclass(driver);
	pc.remove_in();
}


@Then("product should be add and removed from the cart")
public void product_should_be_add_and_removed_from_the_cart() {
   driver.close();
}



}
