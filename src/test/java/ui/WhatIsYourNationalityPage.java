package ui;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WhatIsYourNationalityPage extends PageObject {
    
     WebElement countryName = $(By.id("response"));
}
