package mainMethod;

import browser.openBrowser;
import pages.*;
import screenShot.screenshot;

public class main {

    public static void main(String[] args) throws Exception {
        openBrowser.open(); //
        openBrowser.URL();  //
        signIn.signinbutton(); //

        shop.shopItem();   //
        //shop.Filters();
        //shop.priceRage();
        shop.selectItem();  //
        shop.selectSize();  //
        shop.selectColor();  //
        shop.addToBasket();   //
        cart.openCart();
        // Checkout.checko();
        cart.clearCart();  //
        screenshot.takeSnapShot();  //
        cart.closeCart();   //
        featured.featureOption();   //
        featured.selectFeatureItem();  //
        shop.addToBasket();   //
        shop.removeItemFormBasket();  //


    }
}