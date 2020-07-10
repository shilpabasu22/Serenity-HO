package stepdefinitions;

import net.thucydides.core.annotations.Steps;
import pages.CheckIfYouNeedVisaPage;
import pages.SelectCountryPage;
import pages.StartVisaApplicationPage;
import pages.VisaDurationPage;
import pages.VisaRequirementDecisionPage;

import static org.assertj.core.api.Assertions.assertThat;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class CheckVisaRequirement {
	
	@Steps
	StartVisaApplicationPage start;
	
	@Steps
	CheckIfYouNeedVisaPage checkVisa;
	
	@Steps
	SelectCountryPage country;
	
	@Steps
	VisaRequirementDecisionPage decision;
	
	@Steps
	VisaDurationPage duration;
	
	@Given("^I provide nationality of (.*)$")
	public void i_provide_nationality(String country) {
		
	}
	
	@And("^I select the (.*)$")
	public void i_select_the_reason(String reason) {
		
	}

	
	@And("^I state (.*)$")
	public void i_state_intention(String intention) {
		
	}
   
	@When("^I submit the form$")
	public void i_submit_the_form() {
		
	}
	
	@Then("^I will be informed (.*)$")
	public void i_will_be_informed_decision(String decision) {
		
	}
}
