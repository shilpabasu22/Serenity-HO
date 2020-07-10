package ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class SelectCountryUIPage extends PageObject {

    public void selectCountryPageLoad(){
        String nationalityOnTravelDocument = $(By.xpath("//label[@class='govuk-label govuk-label--m']")).getText();
        Assert.assertTrue("Select Nationality Page is displayed", nationalityOnTravelDocument.contains("What’s your nationality as shown on your passport or travel document?"));
    }
    public void selectHomeCountry(String country){

        Select homeCountry = new Select($(By.id("response")));
        homeCountry.selectByVisibleText(country);
    }

    public void clickNextButton(){
        $(By.xpath("//button[@class='gem-c-button govuk-button gem-c-button--bottom-margin']")).click();
    }
}
