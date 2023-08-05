package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static browser.openBrowser.driver;

public class signIn {
    private static String eemail;
    private static String passcode;

    public static void signinbutton() throws Exception
    {
        WebElement signIn = driver.findElement(By.xpath("//a[contains(text(),'Sign In')]"));
        signIn.click();

        System.out.println(driver.getTitle());
        Thread.sleep(2000);
    }
    public static void Emailidsigin() throws Exception
    {
        eemail=signUP.getemailid();
        WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
        email.sendKeys("harika22222@gmail.com");
        Thread.sleep(2000);
    }

    public static void passcodesigin() throws Exception
    {
        passcode=signUP.getpasscode();
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("Passcode");
        Thread.sleep(2000);
    }

    public static void siginbutton()
    {
        WebElement signIn_button = driver.findElement(By.xpath("//button[@class='button auth-button']"));
        signIn_button.click();
    }

}


