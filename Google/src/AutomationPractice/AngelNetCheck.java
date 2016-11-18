package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.util.concurrent.TimeUnit.SECONDS;


/**
 * Created by Sergey on 11/18/2016.
 */
public class AngelNetCheck {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "D://Tester/GoogleDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://angel.net/~nic/passwd.current.html");
        String mp="P@ssw0rd";
        for (int i=1; i<=10; i++) {
            driver.findElement(By.name("site")).clear();
            driver.findElement(By.name("master")).clear();
            driver.findElement(By.name("master")).sendKeys(mp);
            driver.findElement(By.name("site")).sendKeys("vk" + i + ".com");
            driver.findElement(By.xpath("//input[@type='submit']")).submit();
            //driver.manage().timeouts().implicitlyWait(1, SECONDS);
            System.out.println("The password for the site \"vk" + i + ".com\" is " + driver.findElement(By.name("password")).getAttribute("value"));
        }
        boolean test=false;
        String p1,p2;
        driver.findElement(By.name("site")).clear();
        driver.findElement(By.name("master")).clear();
        driver.findElement(By.name("master")).sendKeys(mp);
        driver.findElement(By.name("site")).sendKeys("vk.com");
        driver.findElement(By.xpath("//input[@type='submit']")).submit();
        p1=driver.findElement(By.name("password")).getAttribute("value");
        for (int i=1;i<=100;i++) {
            driver.findElement(By.name("site")).clear();
            driver.findElement(By.name("master")).clear();
            driver.findElement(By.name("master")).sendKeys(mp);
            driver.findElement(By.name("site")).sendKeys("vk.com");
            driver.findElement(By.xpath("//input[@type='submit']")).submit();
            p2=driver.findElement(By.name("password")).getAttribute("value");
            test=p2.equals(p1);
            p1=p2;
        }
        if (test) {
            System.out.println("Site is pretty good");
        }
        else System.out.println("Site is bad");
        driver.close();
        /*
               WebElement element = (WebElement) ((JavascriptExecutor) driver)
               .executeScript("return document.getElementById('gbqfq')");
               element.sendKeys("search text");
               System.out.println(element.getTagName());
               */

    }
    //public String GetPass(String pass) {
       // driver.findElement(By.name("site")).clear();
       // driver.findElement(By.name("master")).clear();
       // driver.findElement(By.name("master")).sendKeys(this.mp);
        //driver.findElement(By.name("site")).sendKeys("vk.com");
        //driver.findElement(By.xpath("//input[@type='submit']")).submit();

}
