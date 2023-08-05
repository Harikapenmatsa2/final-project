package Stepdefenition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.signIn;

public class SigINpage
{
    @Then("Click on sign-in page")
    public void click_on_sign_in_page() throws Exception
    {
        signIn.signinbutton();
    }
    @And("Enter Email-data in email field")
    public void enter_email_data_in_email_field() throws Exception {
      signIn.Emailidsigin();
    }
    @Then("Enter Passcode")
    public void enter_passcode() throws Exception
    {
       signIn.passcodesigin();
    }
    @Then("Click on Signin button")
    public void click_on_signin_button()
    {
       signIn.siginbutton();
    }


}
