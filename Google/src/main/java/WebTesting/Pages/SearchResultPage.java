package WebTesting.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Sergey on 11/26/2016.
 */
public class SearchResultPage {

    private WebDriver driver;

    @FindBy(how= How.XPATH, using="(id(\"rso\")//a)[1]")
    private WebElement firstLink;

    @FindBy(how=How.XPATH, using="//button[@name=\"btnG\"]/span[1]")
    private WebElement searchButton;

    @FindBy(how=How.XPATH, using="//h3[@class='r']//a")
    private List<WebElement> links;

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getFirstLink() {
        searchButton.click ();
        //System.out.println (firstLink.getText ());
        return firstLink.getText ();
    }

    public void print5Links() {
        System.out.println ("Total numbers of links on the page is: "+links.size ());
        Iterator<WebElement> i1= links.iterator();
        for (int i=1;i<=5;i++) {
            System.out.println("The "+i+" link is: "+ i1.next ().getAttribute ("href"));
        }

    }

}
