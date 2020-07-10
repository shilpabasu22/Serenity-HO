package ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;

public class CheckIfVisitingFamilyUIPage extends PageObject {

    public void verifyPageLoad(){
        String verifyPageLoad = $(By.xpath("//legend[@class='govuk-fieldset__legend govuk-fieldset__legend--m']")).getText();
        Assert.assertTrue("Visiting Family or Partner Page is displayed correctly",
                verifyPageLoad.equalsIgnoreCase("Will you be travelling with or visiting either your partner or a family member in the UK?"));
    }

    public void selectFamilyVisitYesOrNo(String YesOrNo){
        $(By.xpath("//label[contains(text(),'"+YesOrNo+"')]")).click();
    }

    public void clickNextButton(){
        $(By.xpath("//button[@class='gem-c-button govuk-button gem-c-button--bottom-margin']")).click();
    }
}
