import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

public class ContextMenuTest extends BaseTest {

    @Test
    public void contextMenu() {

        driver.get("http://the-internet.herokuapp.com/context_menu");
        Actions actions = new Actions(driver);
        WebElement elementLocator = driver.findElement(By.id("hot-spot"));
        actions.contextClick(elementLocator).perform();
        Alert alert = driver.switchTo().alert();
        alert.getText();
        alert.accept();
    }
}