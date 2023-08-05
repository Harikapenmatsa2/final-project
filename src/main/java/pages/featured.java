package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

import static browser.openBrowser.driver;
import static utilits.random.randomNumber;

public class featured {

    public static void featureOption() throws Exception
    {
        WebElement feat = driver.findElement(By.xpath("//a[contains(text(),'Featured')]"));
        feat.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }

    public static void selectFeatureItem() throws Exception {
        List<WebElement> list_item = driver.findElements(By.xpath("//div[@class='product-display-details']"));
        int index_number = randomNumber(list_item.size());
        WebElement select = list_item.get(index_number);
        Thread.sleep(2000);
        System.out.println(select.getText());
        select.click();
    }

}
