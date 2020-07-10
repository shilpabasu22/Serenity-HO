package ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;

public class VisaDurationUIPage extends PageObject {

    public void verifyPageLoad(){
        String verifyPageLoad = $(By.xpath("//legend[@class='govuk-fieldset__legend govuk-fieldset__legend--m']")).getText();
        Assert.assertTrue("Visa Reason Page is displayed correctly", verifyPageLoad.equalsIgnoreCase("How long are you planning to study in the UK for?"));
    }

    public void selectStudyDuration(String duration){
        $(By.xpath("//label[contains(text(),'"+duration+"')]")).click();
    }
    public void clickNextButton(){
        $(By.xpath("//button[@class='gem-c-button govuk-button gem-c-button--bottom-margin']")).click();
    }

}
