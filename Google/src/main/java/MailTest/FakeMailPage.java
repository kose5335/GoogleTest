package MailTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Sergey on 11/20/2016.
 */
public class FakeMailPage {
    public static void checkReceiveMail(WebDriver driver2) {
        try {
            driver2.switchTo ().frame ("emailFrame");
            String recievedText = driver2.findElement (By.xpath ("/html/body")).getText ();
            System.out.println(recievedText);
            if (recievedText.contains (FakeEmailGenTest.CHECK_TEXT)) System.out.println("The test is ok");
            else System.out.println("The test is failed");
            driver2.switchTo ().defaultContent ();
        } catch (Exception e) {
            System.out.println("The mail was not sent");
        }

    }

    public static void openFakeMail(WebDriver driver2) {
        driver2.get ("http://www.fakemailgenerator.com");
        WebElement userNameField = driver2.findElement (By.xpath ("//input[@id='home-email']"));
        userNameField.clear ();
        userNameField.sendKeys (GetRandUserName.userName);
        WebElement selectDomainButton = driver2.findElement (By.id ("domain"));
        //System.out.print (selectDomainButton.getText ());
        selectDomainButton.click ();
        WebElement selectDomain = driver2.findElement (By.xpath ("//div[@class='input-group']//a[text()='"+ FakeEmailGenTest.DOMAIN_NAME +"']"));
        selectDomain.click ();
    }
}
