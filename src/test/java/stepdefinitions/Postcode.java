package stepdefinitions;

import api.PostcodeAPI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class Postcode {
    @Steps
    PostcodeApISteps postcodeApi;

    @Given("^User enters valid(.*)$")
    public void user_enters_valid(String postcode){
        postcodeApi.searchPostcode(postcode);
    }

    @Then("^Verify user gets valid (.*) from the API$")
    public void verify_user_gets_valid_code(int code){
        postcodeApi.verifyStatusCode(code);
    }
}
