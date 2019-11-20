package CucumberDemo.Aug26Phase2;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	String str;
	
	@When("^enter hello world$")
	public void action() throws Throwable {
		str="hello World";
	}

	@Then("^string will be displayed in the console$")
	public void display() throws Throwable {
		System.out.println(str);
	}



}
