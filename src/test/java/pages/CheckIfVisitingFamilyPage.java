package pages;

import net.thucydides.core.annotations.Step;
import ui.CheckIfVisitingFamilyUIPage;

public class CheckIfVisitingFamilyPage {

    CheckIfVisitingFamilyUIPage visitingFamily;
    @Step
    public void verifyPageLoad(){
        visitingFamily.verifyPageLoad();
    }

    @Step
    public void selectVisitingFamily(String YesOrNo){
        visitingFamily.selectFamilyVisitYesOrNo(YesOrNo);
    }

    @Step
    public void clickNextButton(){
        visitingFamily.clickNextButton();

    }
}
