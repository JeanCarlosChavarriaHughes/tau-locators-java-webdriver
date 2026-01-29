package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

public class SimpleWebTest extends  BaseTest {


    @Test
    public void searchDuckDuckGo() {
        // Load the page
        driver.get("https://www.duckduckgo.com");

        // Enter search phrase
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchbox_input")));
        WebElement searchInput = driver.findElement(By.id("searchbox_input"));
        searchInput.sendKeys("giant panda");
        searchInput.sendKeys(Keys.ENTER);

        // Wait for results to appear
        System.out.println(driver.getTitle());
        wait.until(ExpectedConditions.titleContains("giant panda"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h2 a[data-testid='result-title-a'] span")));

        // Make sure first 3 results contains the word "panda"
        int count = 3;
        List<WebElement> resultLinks = driver.findElements(By.cssSelector("h2 a[data-testid='result-title-a'] span"));
        for (WebElement link : resultLinks) {
            if (count > 0) {
                System.out.println(link.getText());
                assertTrue(link.getText().matches("(?i).*panda.*"));
            } else {
                break;
            }
            count--;
        }
    }
}
