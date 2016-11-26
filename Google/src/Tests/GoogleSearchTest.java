package Tests;

import Pages.GoogleHomePage;
import Pages.SearchResultPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * Created by Sergey on 11/26/2016.
 */
public class GoogleSearchTest {

    private WebDriver chromeDriver;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "D://Tester/GoogleDriver/chromedriver.exe");
        chromeDriver = new ChromeDriver ();
        chromeDriver.manage ().timeouts ().implicitlyWait (5, TimeUnit.SECONDS);
        chromeDriver.get ("https://www.google.com.ua/");
        System.out.println ("The test is started");
    }
/*
    @After
    public void tearDown() throws Exception {
       chromeDriver.close ();
       System.out.println ("The test is finished");
    }
*/
    @Test
    public void testSearch() throws Exception {
        GoogleHomePage google = new GoogleHomePage (chromeDriver);
        SearchResultPage result = google.search("Trandafilov Vladimir");
        //SearchResultPage.print5Links ();
        assertTrue(result.getFirstLink().contains("Trandafilov Vladimir"));

    }
}


