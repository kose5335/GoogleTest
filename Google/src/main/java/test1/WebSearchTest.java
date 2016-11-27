package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


/**
 * Created by Sergey on 11/6/2016.
 */
public class WebSearchTest {

    public static final String GOOGLE = "https://www.google.com.ua/";
    public static final String KSV = "КОНОНЕНКО СЕРГЕЙ ВЛАДИМИРОВИЧ";

    public static void main(String[] args) throws Exception
    {

        System.setProperty("webdriver.chrome.driver", "D://Tester/GoogleDriver/chromedriver.exe");
        WebDriver driver = GooglePage.openHomePage ();
        GooglePage.openSearchPage (driver);
        List<WebElement> links = SearchPage.findLinks (driver);
        SearchPage.checkTheFirstLink (links);
        SearchPage.theEnd (driver);

    }

}
