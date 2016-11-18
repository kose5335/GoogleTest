package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Created by Sergey on 11/18/2016.
 */
public class DemoqaRegistration {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "D://Tester/GoogleDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demoqa.com/registration/");

        driver.findElement(By.id("name_3_firstname")).sendKeys("Sergey");
        driver.findElement(By.id("name_3_lastname")).sendKeys("Kononenko");
        driver.findElement(By.xpath("//div[@class='radio_wrap'][1]/input[@value='married']")).click();
        driver.findElement(By.xpath("//input[@value='dance']")).click();
        WebElement selectElem = driver.findElement(By.id("dropdown_7"));
        Select select1 = new Select(selectElem);
        select1.selectByVisibleText("Russia");
        Select select2 = new Select(driver.findElement(By.id("mm_date_8")));
        select2.selectByVisibleText("9");
        Select select3 = new Select(driver.findElement(By.id("dd_date_8")));
        select3.selectByVisibleText("25");
        Select select4 = new Select(driver.findElement(By.id("yy_date_8")));
        select4.selectByVisibleText("1987");
        driver.findElement(By.id("phone_9")).sendKeys("0509999999");
        driver.findElement(By.id("username")).sendKeys("kose");
        driver.findElement(By.id("email_1")).sendKeys("kononenko_sv@mail.ru");
        File f = new File("C:\\Users\\Sergey\\Desktop\\2016-08-28_17-21-28.png");
        if(f.exists()) {
            driver.findElement(By.id("profile_pic_10")).sendKeys(f.getAbsolutePath());
        }
        driver.findElement(By.id("description")).sendKeys("bla-bla-bla");
        //driver.manage().timeouts().implicitlyWait(3, SECONDS);
        driver.findElement(By.id("password_2")).sendKeys("P@ssw0rd_xc(f_+fsdf");
        //driver.manage().timeouts().implicitlyWait(3, SECONDS);
        driver.findElement(By.id("confirm_password_password_2")).sendKeys("P@ssw0rd_xc(f_+fsdf");

        //driver.findElement(By.id("submit")).click();
        //driver.close();

    }
}
