package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Numbers {
	
	@Before
	@After
	
	@Given("the first ten numbers")
	public void the_first_ten_numbers() {
		System.out.println("the first ten numbers");
	}

	@Given("all the numbers")
	public void all_the_numbers() {
	System.out.println("The numbers");
	}

	@When("number one")
	public void number_one() {
		System.out.println("one");
	}
	@When("number two")
	public void number_two() {
		System.out.println("two");
	}
	@When("number three")
	public void number_three() {
		System.out.println("three");
	}
	@When("number four")
	public void number_four() {
		System.out.println("four");
	}
	@When("number five")
	public void number_five() {
		System.out.println("five");
	}

	@When("number six")
	public void number_six() {
		System.out.println("six");
	}

	@When("number seven")
	public void number_seven() {
		System.out.println("seven");
	}

	@When("number eight")
	public void number_eight() {
		System.out.println("eight");
	}

	@When("number nine")
	public void number_nine() {
		System.out.println("nine");
	}

	@When("number ten")
	public void number_ten() {
		System.out.println("ten");
	}
}