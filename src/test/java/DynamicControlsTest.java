import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

public class DynamicControlsTest extends BaseTest {

    @Test
    public void dynamicControls() {

        driver.get("http://the-internet.herokuapp.com/dynamic_controls");
        driver.findElement(By.xpath("//button[text()='Remove']")).click();
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("message"))));
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        int numberOfElements = driver.findElements(By.cssSelector("[type=checkbox]")).size();
        assertEquals(numberOfElements, 0, "Incorrect number of inputs");
        boolean isDisabled = driver.findElement(By.cssSelector("[type=text]")).isEnabled();
        assertFalse(isDisabled, "The input is enabled");
        driver.findElement(By.xpath("//button[text()='Enable']")).click();

        WebDriverWait waitTheSecond = new WebDriverWait(driver, 20);
        waitTheSecond.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"It's enabled!\")]")));
        boolean isEnabled = driver.findElement(By.cssSelector("[type=text]")).isEnabled();
        assertTrue(isEnabled, "The input is Disabled");
    }

    public static void main(String[] args) {

        System.out.println("//p[contains(text(),'It\'s enabled!')]");
        System.out.println("hello");
        try {
            Thread.sleep(5000);

        } catch (Exception ex) {
            //  ignore
        }
        System.out.println("Natalya");
    }

    @Test
    public void inputsCheck() {

        driver.get("http://the-internet.herokuapp.com/dynamic_controls");
        driver.findElement(By.xpath("//button[text()='Remove']")).click();
        WebDriverWait wait = new WebDriverWait(driver, 15);

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("message"))));
        WebElement e = driver.findElement(By.id("message"));
        waitElementDisplayed(e);


        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        int numberOfElements = driver.findElements(By.cssSelector("[type=checkbox]")).size();
        assertEquals(numberOfElements, 0, "??????? ???????????? ?? ????????");
        boolean isDisabled = driver.findElement(By.cssSelector("[type=text]")).isEnabled();
        assertFalse(isDisabled, "The input is enabled");
        driver.findElement(By.xpath("//button[text()='Enable']")).click();
        WebDriverWait waitTheSecond = new WebDriverWait(driver, 20);
        waitTheSecond.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'It's enabled!')]")));
        waitTheSecond.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"It's enabled!\")]")));
        boolean isEnabled = driver.findElement(By.cssSelector("[type=text]")).isEnabled();
        assertTrue(isEnabled, "The input is Disabled");
    }

    private void waiting() {
        try {
            Thread.sleep(1000);

        } catch (Exception ex) {}

    }
    private void waitElementDisplayed(WebElement element){
        while (true) {
            if (element.isDisplayed()) {
                break;
            } else {
                waiting();
            }
        }


    }
}