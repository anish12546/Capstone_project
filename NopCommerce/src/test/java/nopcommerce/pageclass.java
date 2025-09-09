package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageclass {
	WebDriver driver;
	
	//register
	By register=By.linkText("Register");
	By gender=By.id("gender-male");
	By fname=By.id("FirstName");
	By lname=By.id("LastName");
	By mail=By.id("Email");
	By password=By.id("Password");
	By cpassword=By.id("ConfirmPassword");
	By buttonregister=By.id("register-button");
	By cont=By.cssSelector("a[class=\"button-1 register-continue-button\"]");
	
	//login
	By login=By.cssSelector("a[class=\"ico-login\"]");
	By login_mail=By.cssSelector("input[class=\"email\"]");
	By login_password=By.id("Password");
	By login_button=By.cssSelector("button[class=\"button-1 login-button\"]");
	
	
	//searching product
	By searchp=By.cssSelector("input[id=\"small-searchterms\"]");
	By searchbutton=By.linkText("Search");
	
	//add to cart
	
	By img=By.linkText("Camera & photo");
	By itemselect=By.linkText("Nikon D5500 DSLR");
	By add=By.cssSelector("button[id=\"add-to-cart-button-14\"]");
	By showcart=By.cssSelector("a[class=\"ico-cart\"]");
	
	//remove
	By remove=By.cssSelector("button[class=\"remove-btn\"]");
	
	//wishlist
	By addwhishlist=By.id("add-to-wishlist-button-14");
	By showwishlist=By.cssSelector("a[class=\"ico-wishlist\"]");
	By removewishlist=By.cssSelector("button[class=\"remove-btn\"]");
	
	//compare to 
	By product=By.linkText("Computers");
	By subproduct=By.linkText("Notebooks");
	By product1=By.linkText("Apple MacBook Pro");
	By clickp1=By.xpath("//*[@id=\"product-details-form\"]/div/div[1]/div[2]/div[9]/div[2]/button");
	By product2=By.linkText("Asus Laptop");
	By clickp2=By.xpath("//*[@id=\"product-details-form\"]/div/div[1]/div[2]/div[8]/div[2]/button");
	By comaprepage=By.cssSelector("a[href=\"/compareproducts\"]");	
	
	
	//change address
	By myaccount=By.cssSelector("a[class=\"ico-account\"]");
	By address=By.cssSelector("a[href=\"/customer/addresses\"]");
	By edit=By.cssSelector("button[class=\"button-2 edit-address-button\"]");
	By add1=By.id("Address_Address1");
	By select=By.cssSelector("button[class=\"button-1 save-address-button\"]");
	
	//chnagecurrency
	By currency=By.cssSelector("select>option[value=\"https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2Fnotebooks\"]");
	
	
	//add address
	By addnew=By.cssSelector("button[class=\"button-1 add-address-button\"]");
	By firstnameadd=By.id("Address_FirstName");
	By lastnameadd=By.id("Address_LastName");
	By emailadd=By.id("Address_Email");
	By state=By.cssSelector("select>option[value=\"1715\"]");
	By city=By.id("Address_City");
	By addressadd=By.id("Address_Address1");
	By zipcode=By.id("Address_ZipPostalCode");
	By phoneadd=By.id("Address_PhoneNumber");
	By save_btn=By.cssSelector("button[class=\"button-1 save-address-button\"]");
	
	
	
	public pageclass(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void register_in() {
		
		driver.findElement(register).click();
	}
	
	public void fname_in(String firstname) {
		driver.findElement(gender).click();
		driver.findElement(fname).click();
		driver.findElement(fname).sendKeys(firstname);

	}
	
	public void lname_in(String lastname) {
		driver.findElement(lname).click();
		driver.findElement(lname).sendKeys(lastname);
		
	}
	
	public void email_in(String email) {
		driver.findElement(mail).click();
		driver.findElement(mail).sendKeys(email);

	}
	
	public void password_in(String Password) {
		
		driver.findElement(password).click();
		driver.findElement(password).sendKeys(Password);
		

	}
	
	public void confirmpassword_in(String Cpassword) {
		driver.findElement(cpassword).click();
		driver.findElement(cpassword).sendKeys(Cpassword);
		

	}
		
	public void register_button() throws InterruptedException {
		//button-registraction
		 driver.findElement(buttonregister).click();
		 Thread.sleep(1000);
		 driver.findElement(cont).click();
		
	}
	
	
	
	//login
	public void emai_in() {
		driver.findElement(login).click();
		driver.findElement(login_mail).sendKeys("jadhavanish415@gmail.com");
	}
	
	public void pass_in() {
		driver.findElement(login_password).sendKeys("12102002@Aa");
	}
	
	public void login_btn() {
		driver.findElement(login_button).click();
	}
	
	
	public void search_in() {
		driver.findElement(searchp).click();
		
		
		
//		String searchitem[]= {"laptop", "mobile" , "shoes"};
//		for(String search : searchitem) {
//			WebElement product=driver.findElement(searchp);
//			product.click();
//			product.clear();
//			product.sendKeys(search);
//			product.sendKeys(Keys.ENTER);
//			driver.findElement(searchbutton).click();
//			Thread.sleep(2000);
//			
//		}
	}
	
	public void search_btn() throws InterruptedException {
		driver.findElement(searchbutton).click();
		//Thread.sleep(4000);
		
	}
	
	//Add to cart method
	
	public void add_to_cart_in() throws InterruptedException {
		
		driver.findElement(img).click();
		Thread.sleep(1000);
		driver.findElement(itemselect).click();
		Thread.sleep(1000);
		
		driver.findElement(add).click();
		
	}
	
	public void show_in() throws InterruptedException {
		
		driver.findElement(showcart).click();
		Thread.sleep(2000);
	}
	
	public void remove_in() throws InterruptedException {
		driver.findElement(remove).click();;
		Thread.sleep(2000);
	}

		
	//wish list method
	
	public void wishlist_in() throws InterruptedException  {
		driver.findElement(img).click();
		Thread.sleep(1000);
		
		driver.findElement(itemselect).click();
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1800)");
		
		driver.findElement(addwhishlist).click();
	}
	
	public void show_w_in() throws InterruptedException {
		driver.findElement(showwishlist).click();
		Thread.sleep(2000);
	}
	
	public void remove_w_in() throws InterruptedException {
		driver.findElement(removewishlist).click();
		Thread.sleep(2000);
	}
		
	
	//compare to
	public void product_category() {
		driver.findElement(product).click();
		driver.findElement(subproduct).click();
	}
	
	public void first_product_in() throws InterruptedException {
		driver.findElement(product1).click();
		driver.findElement(clickp1).click();
		Thread.sleep(2000);
	}
	
	public void second_product_in() throws InterruptedException {
		driver.findElement(product2).click();
		driver.findElement(clickp2).click();
		Thread.sleep(2000);
	}
	
	public void comapre_in() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000)");
		
		driver.findElement(comaprepage).click();
		
		Thread.sleep(3000);
	}
	
	//add new address
	public void add_btn() {
		driver.findElement(addnew).click();
	}
	
	public void address_details_in() throws InterruptedException {
		driver.findElement(firstnameadd).sendKeys("anish");
		driver.findElement(lastnameadd).sendKeys("jadhav");
		driver.findElement(emailadd).sendKeys("anishjadhav585@gmail.com");
		driver.findElement(state).click();
		driver.findElement(city).sendKeys("navi mumbai");
		driver.findElement(addressadd).sendKeys("sec 7 room no 555 koperkhairen ");
		driver.findElement(zipcode).sendKeys("400708");
		driver.findElement(phoneadd).sendKeys("12345");
		Thread.sleep(2000);
	}
	
	public void save_btn_in() {
		driver.findElement(save_btn).click();
	}
	
	//change address
	public void myaccount_in() {
		driver.findElement(myaccount).click();
	}
	
	public void address_in() {
		driver.findElement(address).click();
	}
	
	public void edit_in() {
		driver.findElement(edit).click();
	}
	
	public void new_add() {
		driver.findElement(add1).clear();
		driver.findElement(add1).sendKeys("sec 8 koperkhairne");
	}
	
	public void select_in() {
		driver.findElement(select).click();
	}
	
	//change currency
	
	public void change_currency() throws InterruptedException {
		
		driver.findElement(currency).click();
		Thread.sleep(2000);
	}
	
	//
		
}
