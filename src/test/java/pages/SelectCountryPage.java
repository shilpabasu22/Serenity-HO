package pages;

import net.thucydides.core.annotations.Step;
import ui.SelectCountryUIPage;

public class SelectCountryPage {

	SelectCountryUIPage selectCountry;
	@Step
	public void verifyNationalitySelectionPageIsDisplayed(){
		selectCountry.selectCountryPageLoad();
	}
	@Step
	public void selectCountry(String countryName) {
		selectCountry.selectHomeCountry(countryName);
	}
	
	@Step
	public void clickNext() {
		selectCountry.clickNextButton();
	}

}
