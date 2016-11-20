package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Created by Sergey on 11/20/2016.
 */
public class GooglePage {
    static void openSearchPage(WebDriver driver) {
        driver.findElement(By.name("q")).sendKeys(WebSearchTest.KSV);
        driver.findElement(By.name("btnG")).click();
        driver.manage().timeouts().implicitlyWait(3, SECONDS);
    }

    static WebDriver openHomePage() {
        WebDriver driver = new ChromeDriver ();
        driver.get(WebSearchTest.GOOGLE);
        return driver;
    }
}
