package WebTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Created by Sergey on 11/17/2016.
 */
public class EnterWords  {
    //String w;
    //System.setProperty("webdriver.chrome.driver", "D://Tester/GoogleDriver/chromedriver.exe");
    //driver.get("https://translate.google.com/#ru/en");
    public static String word(String w) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://translate.google.com/#ru/en");
        driver.findElement(By.xpath("//textarea[@id='source']")).sendKeys(w);
        driver.findElement(By.id("gt-submit")).click();
        driver.manage().timeouts().implicitlyWait(3, SECONDS);
        String se = driver.findElement(By.xpath("//span[@id='result_box']/span")).getText();
        //driver.close();
        return se;
    }
}
