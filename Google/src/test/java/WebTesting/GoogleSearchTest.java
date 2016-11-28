package WebTesting;

import WebTesting.Pages.GoogleHomePage;
import WebTesting.Pages.SearchResultPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * Created by Sergey on 11/26/2016.
 */

@SuppressWarnings("DefaultFileTemplate")
@RunWith (value = Parameterized.class)
public class GoogleSearchTest {

    private WebDriver chromeDriver;
    private final String value;
    private final String expected;

    public GoogleSearchTest(String value, String expected) {
        this.value = value;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[] [] data = new Object[][] {
                {"Trandafilov Vladimir", "Trandafilov"},
                {"Таксюр Мария", "Таксюр"},
                {"Дубровина Валентина", "ДУБРОВИНА"}
        };
        return Arrays.asList(data);
    }

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "D://Tester/GoogleDriver/chromedriver.exe");
        chromeDriver = new ChromeDriver ();
        chromeDriver.manage ().timeouts ().implicitlyWait (5, TimeUnit.SECONDS);
        chromeDriver.get ("https://www.google.com.ua/");
        System.out.println ("The test is started");
    }

    @After
    public void tearDown() throws Exception {
       chromeDriver.close ();
       System.out.println ("The test is finished");
    }

    @Test
    public void testSearch() throws Exception {
        GoogleHomePage google = new GoogleHomePage (chromeDriver);
        SearchResultPage result = google.search(value);
        System.out.println ("The first link is: "+result.getFirstLink());
        result.print5Links ();
        assertTrue(result.getFirstLink().contains(expected));

    }
}


