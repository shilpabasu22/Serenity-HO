package stepdefinitions;

import net.thucydides.core.annotations.Steps;
import pages.*;


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
	SelectCountryPage nation;
	
	@Steps
	VisaRequirementDecisionPage visaDecision;
	
	@Steps
	VisaDurationPage duration;

	@Steps
	CheckIfVisitingFamilyPage checkIfVisitingFamily;
	
	@Given("I provide nationality of (.*)")
	public void i_provide_nationality(String country) {
		start.navigateToUrl();
		start.startApplication();
		nation.verifyNationalitySelectionPageIsDisplayed();
		nation.selectCountry(country);
		nation.clickNext();

		
	}
	
	@And("I select the (.*)")
	public void i_select_the_reason(String reason) {
		checkVisa.verifyPageLoad();
		checkVisa.selectVisitReason(reason);

		
	}

	
	@And("I state (.*)")
	public void i_state_intention(String intention) {
		checkVisa.clickNext();
		if(intention.equalsIgnoreCase("I am intending to stay for more than 6 months")){
			duration.verifyPageLoad();
			duration.visaDuration("longer than 6 months");
		}else{
			checkIfVisitingFamily.verifyPageLoad();
			checkIfVisitingFamily.selectVisitingFamily("No");
		}
		
	}
   
	@When("I submit the form")
	public void i_submit_the_form() {
			duration.clickNext();
		
	}
	
	@Then("I will be informed (.*)")
	public void i_will_be_informed_decision(String decision) {
		visaDecision.verifyVisaDecision(decision);
	}
}
