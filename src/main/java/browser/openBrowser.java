package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openBrowser {
public static WebDriver driver;
    public static void open(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    public static void URL() throws InterruptedException
    {
        driver.get("https://salinaka-ecommerce.web.app/");
        Thread.sleep(2000);
        System.out.println( driver.getTitle());
    }
    public static void close()
    {
        driver.close();
    }
}
