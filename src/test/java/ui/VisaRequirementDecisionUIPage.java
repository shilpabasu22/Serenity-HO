package ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;

public class VisaRequirementDecisionUIPage extends PageObject {

    public void visaDecision(String decision){
        String verifyVisaDecision = $(By.xpath("//h2[contains(@class,'govuk-!-margin-bottom-6')]")).getText();

        if(decision.contains("I need a visa"))
        Assert.assertTrue("Visa is Required for the user", verifyVisaDecision.contains("You’ll need a visa"));
        else
            Assert.assertTrue("Visa is not Required for the user", verifyVisaDecision.equalsIgnoreCase("You won’t need a visa to come to the UK"));
    }


}
