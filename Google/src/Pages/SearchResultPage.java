package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

/**
 * Created by Sergey on 11/26/2016.
 */
public class SearchResultPage {

    private static WebDriver driver;

    @FindBy(how= How.XPATH, using="(id(\"rso\")//a)[1]")
    public WebElement firstLink;

    static List<WebElement> links = driver.findElements (By.xpath ("//h3[@class='r']//a"));

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getFirstLink() {
        return firstLink.getText ();
    }

    public static void print5Links() {
        for (int i=0;i<5;i++) {
            System.out.println("The "+i+" link is: "+ links.get (i).getAttribute ("href"));
        }
    }
}