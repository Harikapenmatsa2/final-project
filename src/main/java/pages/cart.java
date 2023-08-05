package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static browser.openBrowser.driver;

public class cart {

    public static void openCart() throws Exception
    {

        WebElement cartButton = driver.findElement(By.xpath("//button[@class='button-link navigation-menu-link basket-toggle']"));
        cartButton.click();
        Thread.sleep(2000);
    }
    public static void clearCart(){
        WebElement clear = driver.findElement(By.xpath("//button[@class='basket-clear button button-border button-border-gray button-small']"));
        clear.click();
    }
    public static  void closeCart (){
        WebElement close = driver.findElement(By.xpath("//span[contains(text(),'Close')]"));
        close.click();
    }

}

