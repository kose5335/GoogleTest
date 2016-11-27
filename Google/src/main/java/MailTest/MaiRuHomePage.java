package MailTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Sergey on 11/20/2016.
 */
public class MaiRuHomePage {
    public static void clickToNewMail(WebDriver driver1) {
        WebElement writeNewMailButton = driver1.findElement (By.xpath ("(//span[text()='Написать письмо'])[1]"));
        writeNewMailButton.click ();
    }

    public static void loginOnMailRu(WebDriver driver1) {
        driver1.get ("https://mail.ru");
        driver1.findElement (By.name ("saveauth")).click ();
        WebElement myLoginField = driver1.findElement (By.id ("mailbox__login"));
        myLoginField.sendKeys (FakeEmailGenTest.MAIL_BOX_NAME);
        WebElement myPassField = driver1.findElement (By.id ("mailbox__password"));
        myPassField.sendKeys (FakeEmailGenTest.PASS);
        WebElement authButton = driver1.findElement (By.id ("mailbox__auth__button"));
        authButton.click ();
    }
}
