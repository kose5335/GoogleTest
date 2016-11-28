package WebTesting.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Sergey on 11/26/2016.
 */
@SuppressWarnings("DefaultFileTemplate")
public class GoogleHomePage {

    private WebDriver driver;

    @FindBy(how= How.XPATH, using="id(\"lst-ib\")")
    private WebElement searchField;
/*
    @FindBy(how=How.XPATH, using="//button[@name=\"btnG\"]/span[1]")
    private WebElement searchButton;
*/
    public GoogleHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public SearchResultPage search(String request) {
        searchField.sendKeys (request);
        //searchButton.click ();
        return new SearchResultPage (driver);
    }



}
