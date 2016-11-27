package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Sergey on 11/20/2016.
 */
public class SearchPage {
    static void checkTheFirstLink(List<WebElement> links) {
        if (links.get(0).getText ().contains (WebSearchTest.KSV)) {
            System.out.println ("According to the request \"" + WebSearchTest.KSV + "\" the test is passed");
        }
        else System.out.println("According to the request \""+ WebSearchTest.KSV+"\" the test is failed");
        System.out.println(links.get(0).getText ());
    }

    static List<WebElement> findLinks(WebDriver driver) {
        List<WebElement> links=driver.findElements(By.xpath("//h3[@class='r']//a"));
        System.out.println("Total element is "+links.size());
        Iterator<WebElement> i1=links.iterator();
        for (int i=1; i <=5; i++) {
            System.out.println(i+" link: "+i1.next().getAttribute("href"));
        }
        return links;
    }

    static void theEnd(WebDriver driver) {
        driver.close();
    }
}
