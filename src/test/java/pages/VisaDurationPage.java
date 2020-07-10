package pages;

import net.thucydides.core.annotations.Step;
import ui.VisaDurationUIPage;

public class VisaDurationPage {
    VisaDurationUIPage visaDuration;

    @Step
    public void verifyPageLoad(){
        visaDuration.verifyPageLoad();
    }
    @Step
    public void visaDuration(String duration){
        visaDuration.selectStudyDuration(duration);

    }
    @Step
    public void clickNext(){
        visaDuration.clickNextButton();

    }

}
