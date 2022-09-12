import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class InputsTest extends BaseTest {

    @Test
    public void inputs() {
        driver.get("http://the-internet.herokuapp.com/inputs");
        WebElement element = driver.findElement(By.tagName("input"));
        element.sendKeys("3");
        String inputButton;
        inputButton = element.getAttribute("value");
        assertEquals(inputButton, "3", "Number is incorrect");

        element.clear();
        element.sendKeys(Keys.ARROW_UP);
        inputButton = element.getAttribute("value");
        assertEquals(inputButton, "1", "Number is incorrect");

        element.clear();
        element.sendKeys("3");
        element.sendKeys(Keys.ARROW_DOWN);
        inputButton = element.getAttribute("value");
        assertEquals(inputButton, "2", "Number is incorrect");
    }
}