package Stepdefenition;

import browser.openBrowser;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.cart;
import screenShot.screenshot;

public class Cartactions {
    @Then("Open the cart")
    public void open_the_cart() throws Exception
    {
        openBrowser.open();
        openBrowser.URL();
        cart.openCart();
    }
    @And("clear the cart")
    public void clear_the_cart()
    {
       cart.clearCart();
    }
    @Then("close the cart")
    public void close_the_cart()
    {
       cart.closeCart();
    }
    @Then("Take screenshot")
    public void take_screenshot() throws Exception
    {
        screenshot.takeSnapShot();
    }
}
