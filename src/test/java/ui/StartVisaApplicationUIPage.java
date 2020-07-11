package ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import org.junit.Assert;


@DefaultUrl("https://www.gov.uk/check-uk-visa")
public class StartVisaApplicationUIPage extends PageObject {

    public void checkVisaStartPageTitle(){
        String pageTitle = $(By.className("gem-c-title__text")).getText();
        Assert.assertTrue("Page Title matches",pageTitle.equalsIgnoreCase("Check if you need a UK visa"));
        $(By.xpath("//button[@class='gem-c-button govuk-button gem-c-button--inline']")).click();
    }

    public void clickStartButton(){
        $(By.linkText("Start now")).click();

    }
}
