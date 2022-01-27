package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@SuppressWarnings("unused")
public class StepDefinition {
	
	WebDriver d;
	
	
	@Given("the user is provided with the login page")
	public void the_user_is_provided_with_the_login_page() {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\interview\\Drivers\\chromedriver.exe");
		 d=new ChromeDriver();
		 d.navigate().to("https://www.facebook.com/");
		
	    
	}
	@When("the user enters the user name and the password")
	public void the_user_enters_the_user_name_and_the_password() {
		WebElement username = d.findElement(By.id("email"));
	    username.sendKeys("admin");
	    WebElement password1 = d.findElement(By.name("pass"));
	    password1.sendKeys("pass");
	}


	@When("the user clicks the login button")
	public void the_user_clicks_the_login_button() {
		WebElement loginBtn = d.findElement(By.name("login"));
		loginBtn.click();
	   
	}

	@Then("the user enters into the Home Page")
	public void the_user_enters_into_the_home_page() {
		System.out.println("Welcome to the Home page");
	  
		   
	}
	
}
