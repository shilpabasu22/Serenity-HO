package pages;


import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import ui.StartVisaApplicationUIPage;

public class StartVisaApplicationPage {

	StartVisaApplicationUIPage startApplication;
	@Managed
	WebDriver driver;

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
