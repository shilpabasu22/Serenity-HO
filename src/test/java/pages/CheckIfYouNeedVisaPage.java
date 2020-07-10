package pages;

import net.thucydides.core.annotations.Step;
import ui.CheckIfYouNeedVisaUIPage;

public class CheckIfYouNeedVisaPage {

	CheckIfYouNeedVisaUIPage checkVisaReason;

	@Step
	public void verifyPageLoad(){
		checkVisaReason.verifyVisaReasonPageLoad();
	}
	@Step
	public void selectVisitReason(String reason) {
		checkVisaReason.selectVisitReason(reason);
	}
	
	@Step
	public void clickNext() {
		checkVisaReason.clickNextButton();
	}

}
