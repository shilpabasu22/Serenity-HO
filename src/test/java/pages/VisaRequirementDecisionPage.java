package pages;

import net.thucydides.core.annotations.Step;
import ui.VisaRequirementDecisionUIPage;

public class VisaRequirementDecisionPage {
	VisaRequirementDecisionUIPage visaDecision;
	@Step
	public void verifyVisaDecision(String decision) {
		visaDecision.visaDecision(decision);
		
	}

}
