package tests;

import org.junit.jupiter.api.Test;
import pageobjects.DuckDuckGoResultsPage;
import pageobjects.DuckDuckGoSearchPage;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PageObjectWebTest extends  BaseTest {

    @Test
    public void searchDuckDuckGo() {
        DuckDuckGoSearchPage searchPage = new DuckDuckGoSearchPage(driver);
        searchPage.loadPage();
        searchPage.search("giant panda");

        DuckDuckGoResultsPage resultsPage = new DuckDuckGoResultsPage(driver);
        List<String> linkTexts = resultsPage.getResultsLinkText("panda");

        int count = 3;
        for (String text : linkTexts) {
            if (count > 0) {
                assertTrue(text.matches("(?i).*panda.*"));
            } else {
                break;
            }
            count--;
        }
    }
}
