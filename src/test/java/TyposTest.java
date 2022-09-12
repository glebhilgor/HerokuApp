import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class TyposTest extends BaseTest {

    @Test
    public void typos() {
        driver.get("http://the-internet.herokuapp.com/typos");
        List<WebElement> list = driver.findElements(By.tagName("p"));
        String paragraph1 = list.get(0).getAttribute("innerText");
        assertEquals(paragraph1, "This example demonstrates a typo being introduced. It does it randomly on each page load.", "There are a mistake");
        String paragraph2 = list.get(1).getAttribute("innerText");
        assertEquals(paragraph2, "Sometimes you'll see a typo, other times you won't.", "There are a mistake");
    }
}