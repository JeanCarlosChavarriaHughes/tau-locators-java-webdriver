package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DuckDuckGoSearchPage extends AbstractPage {

    public final static By searchInput = By.name("q");
    public final static By searchButton = By.xpath("//button[@aria-label='Search' and @type='submit']");

    public DuckDuckGoSearchPage(WebDriver driver) {
        super(driver);
    }

    public void loadPage() {
        getDriver().get("https://noai.duckduckgo.com/");
    }

    public void search(String phrase) {
        getWait().until(ExpectedConditions.visibilityOfElementLocated(searchInput));
        getDriver().findElement(searchInput).sendKeys(phrase);
        getWait().until(ExpectedConditions.visibilityOfElementLocated(searchButton));
        getDriver().findElement(searchButton).click();
    }
}
