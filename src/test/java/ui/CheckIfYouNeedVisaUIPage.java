package ui;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import net.serenitybdd.core.annotations.findby.By;
import org.openqa.selenium.WebElement;

public class CheckIfYouNeedVisaUIPage extends PageObject {

     public void verifyVisaReasonPageLoad(){
          String verifyPageLoad = $(By.xpath("//legend[@class='govuk-fieldset__legend govuk-fieldset__legend--m']")).getText();
          Assert.assertTrue("Visa Reason Page is displayed correctly", verifyPageLoad.equalsIgnoreCase("What are you coming to the UK to do?"));
     }

     public void selectVisitReason(String reason){
          $(By.xpath("//label[contains(text(),'"+reason+"')]")).click();
     }
     public void clickNextButton(){
          $(By.xpath("//button[@class='gem-c-button govuk-button gem-c-button--bottom-margin']")).click();

     }
}
