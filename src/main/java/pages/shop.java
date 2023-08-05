package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

import java.util.List;

import static browser.openBrowser.driver;
import static utilits.random.randomNumber;

public class shop {

    public static void shopItem()
    {
        driver.findElement(By.xpath("//a[contains(text(),'Shop')]")).click();
    }
    public static void Filters(){
        WebElement filter = driver.findElement(By.xpath("//button[@class='button-muted button-small']"));
        filter.click();
    }
    public static void priceRage()
    {
       WebElement range = driver.findElement(By.xpath("//div[@class"));
        Actions action = new Actions(driver);
        Actions act = (Actions) action.dragAndDropBy(range, 207,478).build();
        ((Actions)act).perform();
    }
    public static void applyFilter()
    {
        WebElement apply = driver.findElement(By.xpath("//button[contains(text(),'Apply filters')]"));
        apply.click();
    }
    public static void selectItem() throws Exception {
        driver.findElement(By.xpath("//a[contains(text(),'Shop')]")).click();
        Thread.sleep(2000);
        List<WebElement> element = driver.findElements(By.xpath("//div[@class='product-details']"));
        int index_number = randomNumber(element.size());
        WebElement select =element.get(index_number);
        System.out.println(select.getText());
        select.click();

        Thread.sleep(2000);

    }
    public static void selectSize() throws Exception {
        Thread.sleep(2000);
        WebElement size = driver.findElement(By.xpath("//body/div[@id='app']/main[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/*[1]"));
        size.click();

        WebElement sizeNumber = driver.findElement(By.xpath("//input[@id='react-select-2-input']"));
        sizeNumber.sendKeys(Keys.ENTER);

    }
    public static void selectColor() throws Exception
    {
        WebElement color= driver.findElement(By.xpath("//body/div[@id='app']/main[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div"));
        color.click();
        Thread.sleep(4000);
    }
    public static void addToBasket() throws Exception {
       WebElement add = driver.findElement(By.xpath("//button[contains(text(),'Add To Basket')]"));
        add.click();
        Thread.sleep(2000);
    }
    public static void removeItemFormBasket() throws Exception
    {
        WebElement  remove= driver.findElement(By.xpath("//button[contains(text(),'Remove From Basket')]"));
        String name = remove.getText();

        if(name.contains("Remove")){
            Thread.sleep(2000);
            remove.click();
            System.out.println(remove);
        }
    }
}
