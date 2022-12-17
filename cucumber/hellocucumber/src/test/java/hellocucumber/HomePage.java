/**
 * Put javadoc here.
 */
package hellocucumber;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

public class HomePage {

    /**
     * Put javadoc here.
     */
    protected final WebDriver driver;

    /**
     * Put javadoc here.
     */
    private final String titleStart = "bdd";

    /**
     * Put javadoc here.
     */
    private final By headerBy = By.tagName("h1");

    /**
     * Put javadoc here.
     */
    private final By showButtonBy = By.id("show");

    /**
     * Put javadoc here.
     */
    private final By colourListBy = By.id("colours-list");

    /**
     * Put javadoc here.
     * @param driver
     */
    public HomePage(WebDriver driver) {
        this.driver = driver;
        Duration fiveSecs = Duration.ofSeconds(5);

        new WebDriverWait(driver, fiveSecs).until(
            new ExpectedCondition<Boolean>() {
                public Boolean apply(WebDriver d) {
                    return d.getTitle().toLowerCase().startsWith(titleStart);
                }
            }
        );
    }

    /**
     * Put javadoc here.
     * @return tbc
     */
    public WebElement getShowButton() {
        return driver.findElement(showButtonBy);
    }

    /**
     * Put javadoc here.
     * @return tbc
     */
    public String getHeaderMessage() {
        List<WebElement> headers = driver.findElements(headerBy);
        Assert.assertEquals("Headers", 1, headers.size());
        return headers.get(0).getText();
    }

    /**
     * Put javadoc here.
     * @return tbc
     */
    public String getColoursList() {
        return driver.findElement(colourListBy).getText();
    }
}
