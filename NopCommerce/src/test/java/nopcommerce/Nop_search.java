package nopcommerce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Nop_search {
	WebDriver driver;
	pageclass pc=new pageclass(driver);
	

	

@Given("search page is open in browser")
public void search_page_is_open_in_browser() {
    driver=new ChromeDriver();
    driver.get("https://demo.nopcommerce.com/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
}

@When("user clicks on the search bar")
public void user_clicks_on_the_search_bar() {
   pc=new pageclass(driver);
   pc.search_in();
}

@When("^enters the product(.*)$")
public void enters_the_product(String product) throws InterruptedException {
	pc=new pageclass(driver);
	//pc.search_in();
	driver.findElement(By.cssSelector("input[id=\"small-searchterms\"]")).clear();
	driver.findElement(By.cssSelector("input[id=\"small-searchterms\"]")).sendKeys(product);
	Thread.sleep(2000);
	pc.search_btn();
	Thread.sleep(2000);
   
}

@Then("search results for product should be displayed")
public void search_results_for_product_should_be_displayed() {
    driver.close();
}
}
