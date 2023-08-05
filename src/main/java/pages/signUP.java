package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static browser.openBrowser.driver;

public class signUP {

    private static String emaildata;
    private static String passworddata;

    public static void signupButton() throws InterruptedException {
        WebElement signup_button =  driver.findElement(By.xpath("//a[@class='button button-small']"));
        signup_button.click();
        System.out.println( driver.getTitle());
        Thread.sleep(2000);
    }
    public static void fullName(String name) throws Exception {
        WebElement full_Name = driver.findElement(By.xpath("//input[@id='fullname']"));
        full_Name.sendKeys(name);
        Thread.sleep(2000);
    }
    //seting the emailID using feature files to use in signup page
    public static void emailId(String Email) throws Exception {
        WebElement email_id = driver.findElement(By.xpath("//input[@id='email']"));
        email_id.sendKeys(Email);
        emaildata=Email;
        Thread.sleep(2000);
    }
    //getting the data which is used to create sigup page and logingin using the data using setters and getters
    public static String getemailid()
    {
        return emaildata;
    }
    public static void password(String passw) throws Exception {
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys(passw);
        passworddata=passw;
        Thread.sleep(2000);
    }
    public static String getpasscode()
    {
        return passworddata;
    }
    public static void submit(){
        WebElement sign_up = driver.findElement(By.xpath("//button[@class='button auth-button']"));
        sign_up.click();
    }
}

