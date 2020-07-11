package api;

import net.thucydides.core.annotations.DefaultUrl;
import stepdefinitions.PostcodeApISteps;

//@DefaultUrl("api.postcodes.io/postcodes/")
public class PostcodeAPI {

    PostcodeApISteps postcodeApi;

            public void searchForPostCode(String postcode){
                postcodeApi.searchPostcode(postcode);
            }

            public void verifyStatusCode(int code){
                postcodeApi.verifyStatusCode(code);
            }


}
