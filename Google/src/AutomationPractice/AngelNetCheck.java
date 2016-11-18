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
        String mp="P@ssw0rd",site="vk.com";
        for (int i=1; i<=10; i++) {
            System.out.println("The password for the site \"vk"+i+".com\" is "+GetPass(driver, mp, "vk" + i + ".com"));
        }
        String p1=GetPass(driver, mp, site);
        int TrueCount=0, Cases=100;
        for (int i=1;i<=Cases;i++) if (p1.equals(GetPass(driver, mp, site))) TrueCount++;
        if (TrueCount==Cases) {
            System.out.println("Site is pretty good");
        }
        else {
            System.out.println("Site is bad");
        }
        driver.close();
    }
    private static String GetPass(WebDriver driver, String pass, String SiteName) {
        driver.findElement(By.name("master")).clear();
        driver.findElement(By.name("site")).clear();
        driver.findElement(By.name("master")).sendKeys(pass);
        driver.findElement(By.name("site")).sendKeys(SiteName);
        driver.findElement(By.xpath("//input[@type='submit']")).submit();
        return driver.findElement(By.name("password")).getAttribute("value");
    }
}


