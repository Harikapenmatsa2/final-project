package Stepdefenition;

import browser.openBrowser;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.featured;
import pages.shop;
import screenShot.screenshot;

public class featuredpage {
    @Given("click on the featured button")
    public void click_on_the_featured_button() throws Exception
    {
       // openBrowser.open();
       // openBrowser.URL();
        featured.featureOption();
    }
    @Then("Select the items from the featured page")
    public void select_the_items_from_the_featured_page() throws Exception
    {
        featured.selectFeatureItem();
    }
    @And("add to basket")
    public void add_to_basket() throws Exception
    {
        shop.selectSize();
        shop.selectColor();
        shop.addToBasket();
    }
    @Then("take screenschot")
    public void take_screenschot() throws Exception
    {
        screenshot.takeSnapShot();
    }
}
