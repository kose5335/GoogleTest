package MailTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Created by Sergey on 11/20/2016.
 */
public class FakeEmailGenTest {

    public static final String USER_NAME = "Finch1970";
    public static final String DOMAIN_NAME = "@rhyta.com";
    public static final String CHECK_TEXT = "Check Test";
    public static final String MAIL_BOX_NAME = "kononenko_sv";
    public static final String PASS = "762312cdr";
    public static final String MAIL_TOPIC = "TestLetter";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D://Tester/GoogleDriver/chromedriver.exe");
        //the first step
        WebDriver driver1 = new ChromeDriver ();
        driver1.manage().timeouts().implicitlyWait(10, SECONDS);
        MaiRuHomePage.loginOnMailRu (driver1);
        MaiRuHomePage.clickToNewMail (driver1);
        MaiRuNewLetterPage.writeNewMail (driver1);
        MaiRuNewLetterPage.clickSend (driver1);
        //the second
        WebDriver driver2 = new ChromeDriver ();
        driver2.manage().timeouts().implicitlyWait(10, SECONDS);
        FakeMailPage.openFakeMail (driver2);
        //the third step
        FakeMailPage.checkReceiveMail (driver2);
        driver1.close (); driver2.close ();
    }
}
