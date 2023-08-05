package Stepdefenition;

import browser.openBrowser;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.signUP;

public class signuppage {

    @Given("Open the Browser")
    public void open_the_browser() throws Exception {
       openBrowser.open();
        openBrowser.URL();
    }
    @Then("enter the Url")
    public void enter_the_url()
    {

    }
    @And("Click on the Signup page to Create new user")
    public void click_on_the_signup_page_to_create_new_user() throws Exception
    {
        signUP.signupButton();
    }
    @Then("enter the {string}")
    public void enter_the(String Email) throws Exception {
        signUP.emailId(Email);
    }
    @And("Enter {string}")
    public void enter(String passw) throws Exception {
        signUP.password(passw);
    }
    @Then("Enter Full name {string}")
    public void enter_full_name(String name) throws Exception {
        signUP.fullName(name);
    }
    @Then("Click on the Sign-up button to create new user")
    public void click_on_the_sign_up_button_to_create_new_user()
    {
        signUP.submit();

    }

}
