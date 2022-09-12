import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NotificationMessageTest extends BaseTest {

    @Test
    public void notificationMessage() {
        driver.get("http://the-internet.herokuapp.com/notification_message_rendered");
        driver.findElement(By.cssSelector("[href='/notification_message']")).click();
        String text = driver.findElement(By.id("flash")).getText();
        assertEquals(text, "Action unsuccessful, please try again", "Both texts are different");
    }
}