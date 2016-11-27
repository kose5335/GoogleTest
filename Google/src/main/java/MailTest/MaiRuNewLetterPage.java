package MailTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Sergey on 11/20/2016.
 */
public class MaiRuNewLetterPage {
    public static void clickSend(WebDriver driver1) {
        WebElement sendButton = driver1.findElement (By.xpath ("(//span[@class='b-toolbar__btn__text'])[1]"));
        sendButton.click ();
    }

    public static void writeNewMail(WebDriver driver1) {
        WebElement sendAddressField = driver1.findElement (By.xpath ("(//textarea[@class='js-input compose__labels__input'])[1]"));
        sendAddressField.sendKeys (GetRandUserName.userName + FakeEmailGenTest.DOMAIN_NAME);
        WebElement sendTopicField = driver1.findElement (By.xpath ("//input[@class='b-input']"));
        sendTopicField.sendKeys (FakeEmailGenTest.MAIL_TOPIC);
        writeInText (driver1);
    }

    public static void writeInText(WebDriver driver1) {
        driver1.switchTo().frame (2);
        //driver1.findElement (By.xpath ("//*[@id="toolkit-147975486920537composeEditor_ifr"]"))
        ////*[@id="toolkit-147975486920537composeEditor_ifr"]
        //toolkit-147975486920537composeEditor_ifr
        //#toolkit-147975486920537composeEditor_ifr
        WebElement sendTextField =driver1.findElement (By.id ("tinymce"));
        sendTextField.clear ();
        sendTextField.sendKeys (FakeEmailGenTest.CHECK_TEXT);
        driver1.switchTo ().defaultContent ();
    }
}
