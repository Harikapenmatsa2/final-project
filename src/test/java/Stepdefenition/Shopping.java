package Stepdefenition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.shop;

public class Shopping
{
    @And("Click on Shop")
    public void click_on_shop()
    {
        shop.shopItem();
    }
    @Then("apply Filters")
    public void apply_filters()
    {

    }
    @Then("select the items to shop")
    public void select_the_items_to_shop() throws Exception
    {
        shop.selectItem();
    }
    @Then("select which size needs to be added")
    public void select_which_size_needs_to_be_added() throws Exception
    {
        shop.selectSize();
    }
    @And("Select the color which suites")
    public void select_the_color_which_suites() throws Exception
    {
       shop.selectColor();
    }
    @Then("add to the Cart")
    public void add_to_the_cart() throws Exception
    {
        shop.addToBasket();
    }
    @And("Remove the item from the cart")
    public void remove_the_item_from_the_cart() throws Exception
    {
       shop.removeItemFormBasket();
    }

}
