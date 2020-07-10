package pages;


import net.thucydides.core.annotations.Step;
import ui.StartVisaApplicationUIPage;

public class StartVisaApplicationPage {

	StartVisaApplicationUIPage startApplication;
	@Step
	public void navigateToUrl() {
		startApplication.open();
		startApplication.checkVisaStartPageTitle();
		
	}
	
	@Step
	public void startApplication() {
		startApplication.clickStartButton();
	}

}
