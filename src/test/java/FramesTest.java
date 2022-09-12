import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FramesTest extends BaseTest {

    @Test
    public void frameTest() {

        driver.get("http://the-internet.herokuapp.com/frames");
        driver.findElement(By.cssSelector("[href='/iframe']")).click();
        driver.switchTo().frame("mce_0_ifr");
        String text = driver.findElement(By.tagName("p")).getText();
        assertEquals(text, "Your content goes here.", "er");
        driver.switchTo().parentFrame();
    }
}