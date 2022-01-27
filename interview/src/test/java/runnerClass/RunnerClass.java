package runnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	
	@RunWith(Cucumber.class)
	@CucumberOptions(features = "Features", glue ={"stepDefinition","hooks"}
	, tags= "@ss"
	, plugin = "pretty", monochrome = true)
	 
	public class RunnerClass {
} 
 