package org.def;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {
	WebDriver driver;
	@Given("user is on facebook page")
	public void user_is_on_facebook_page() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	    // Write code here that turns the phrase above into concrete actions    
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
		WebElement txtuser = driver.findElement(By.id("email"));
		txtuser.sendKeys("ananda");
		
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("345678");
		
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("user should click login button")
	public void user_should_click_login_button() {
		WebElement btn = driver.findElement(By.name("login"));
		btn.click();
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("user need to verify homepage is appread or not")
	public void user_need_to_verify_homepage_is_appread_or_not() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
}
