package stepdefinitions;

import io.restassured.RestAssured;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class PostcodeApISteps {
 private int status;
    @Step
    public void searchPostcode(String postcode){
        status = RestAssured.get("http://api.postcodes.io/postcodes/SW1P4JA").statusCode();
        System.out.println("******************************   "+status+"    *********************************************");
        RestAssured.
                when().get("http://api.postcodes.io/postcodes/SW1P4JA").
                then().statusCode(200);
    }

    @Step
    public void verifyStatusCode(int statusCode){
        Assert.assertEquals(200,statusCode);
    }
}
