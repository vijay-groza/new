package stepDefinition;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScreenShot {
	WebDriver d;
	
	@Given("the user with the url")
	public void the_user_with_the_url() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\interview\\Drivers\\chromedriver.exe");
		d= new ChromeDriver();
		d.navigate().to("https://www.google.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   
	}

	@When("the user wishes to take a screenshot")
	public void the_user_wishes_to_take_a_screenshot() throws IOException {
	   TakesScreenshot ss= (TakesScreenshot)d;
	   File sFile = ss.getScreenshotAs(OutputType.FILE);

	   File dFile= new File("D:\\Eclipse\\interview\\screenShots.png");
	 org.openqa.selenium.io.FileHandler.copy(sFile, dFile); 
	}

	@Then("the screenshot is taken")
	public void the_screenshot_is_taken() {
		d.quit();
	 
	}

}
