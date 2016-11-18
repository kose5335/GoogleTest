package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



/**
 * Created by Sergey on 11/18/2016.
 */
public class AngelNetCheck {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "D://Tester/GoogleDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://angel.net/~nic/passwd.current.html");
        String MasterPass="P@ssw0rd";
        String[] SiteNames   = new String[]{"site1.com","site2.com","site3.com","site4.com","site5.com"};
        for (int i=0; i<SiteNames.length; i++) {
            System.out.println("The password for the site "+SiteNames[i] + " is " + GetPass(driver, MasterPass, SiteNames[i]));
        }
        String p1=GetPass(driver, MasterPass, SiteNames[0]);
        int TrueCount=0, Cases=100;
        for (int i=1;i<=Cases;i++) if (p1.equals(GetPass(driver, MasterPass, SiteNames[0]))) TrueCount++;
        if (TrueCount==Cases) System.out.println("Site is pretty good");
        else System.out.println("Site is bad");
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


