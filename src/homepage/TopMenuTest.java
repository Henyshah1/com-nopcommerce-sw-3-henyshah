package homepage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

import java.util.List;

public class TopMenuTest extends Utility {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    public void selectMenu(String menu) {
        List<WebElement> selectMenu = driver.findElements(By.xpath("//ul[@class='top-menu notmobile']/child::li"));
        for (WebElement element : selectMenu) {
            if (element.getText().equalsIgnoreCase(menu)) {
                element.click();
                break;
            }
        }
    }
        @Test
    public void verifyPageNavigation(){
        selectMenu("Computers");
            selectMenu("Electronics");
            selectMenu("Apparel");
            selectMenu("Digital Downloads");
            selectMenu("Books");
            selectMenu("jewelry");
            selectMenu("Gift Cards");
    }
    @After
    public void tearDown() {
        closeBrowser();
    }
}
