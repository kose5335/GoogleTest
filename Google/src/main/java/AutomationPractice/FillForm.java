package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.util.Iterator;
import java.util.List;



/**
 * Created by Sergey on 11/18/2016.
 */
public class FillForm {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "D://Tester/GoogleDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://toolsqa.com/automation%20practice-form/");
        List<WebElement> links=driver.findElements(By.xpath("//div[@class='control-group']//a"));
        Iterator<WebElement> i1=links.iterator();
        int i=1;
        while (i1.hasNext()) {
            System.out.println(i+" link text: "+i1.next().getText());
            i++;
        }
        driver.findElement(By.name("firstname")).sendKeys("Sergey");
        driver.findElement(By.name("lastname")).sendKeys("Kononenko");
        driver.findElement(By.id("sex-0")).click();
        driver.findElement(By.id("exp-2")).click();
        driver.findElement(By.id("profession-1")).click();
        File f = new File("C:\\Users\\Sergey\\Desktop\\2016-08-28_17-21-28.png");
        if(f.exists()) {
            driver.findElement(By.id("photo")).sendKeys(f.getAbsolutePath());
        }
        driver.findElement(By.id("tool-2")).click();
        WebElement selectElem = driver.findElement(By.id("continents"));
        Select select = new Select(selectElem);
        select.selectByVisibleText("Africa");
        driver.findElement(By.xpath("//select[@id='selenium_commands']/option[1]")).click();
        //driver.findElement(By.id("submit")).click();
        //driver.close();
        //"//div[@class="control-group"]//a"
    }
}
