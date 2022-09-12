import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HoversTest extends BaseTest {

    @Test
    public void hoversUser1() {
        Actions action = new Actions(driver);
        driver.get("http://the-internet.herokuapp.com/hovers");
        WebElement avatar = driver.findElements(By.className("figure")).get(0);

        action.moveToElement(avatar).perform();
        String userName = driver.findElements(By.tagName("h5")).get(0).getText();
        assertEquals(userName, "name: user1", "error");

        action.moveToElement(driver.findElement(By.cssSelector("[href='/users/1']"))).click();
        driver.get("http://the-internet.herokuapp.com/users/1");
        String profile = driver.findElement(By.tagName("h1")).getText();
        assertEquals(profile, "Profile", "Profile page fails to open");
    }

    @Test
    public void hoversUser2() {
        Actions action = new Actions(driver);
        driver.get("http://the-internet.herokuapp.com/hovers");
        WebElement avatar = driver.findElements(By.className("figure")).get(1);
        action.moveToElement(avatar).perform();
        String userName2 = driver.findElements(By.tagName("h5")).get(1).getAttribute("innerText");
        assertEquals(userName2, "name: user2", "error");

        action.moveToElement(driver.findElement(By.cssSelector("[href='/users/2']"))).click();
        driver.get("http://the-internet.herokuapp.com/users/2");
        String profile = driver.findElement(By.tagName("h1")).getText();
        assertEquals(profile, "Profile", "Profile page fails to open");
    }
    @Test
    public void hoversUser3() {
        Actions action = new Actions(driver);
        driver.get("http://the-internet.herokuapp.com/hovers");
        WebElement avatar = driver.findElements(By.className("figure")).get(2);
        action.moveToElement(avatar).perform();
        String userName3 = driver.findElements(By.tagName("h5")).get(2).getText();
        assertEquals(userName3, "name: user3", "error");

        action.moveToElement(driver.findElement(By.cssSelector("[href='/users/3']"))).click();
        driver.get("http://the-internet.herokuapp.com/users/3");
        String profile = driver.findElement(By.tagName("h1")).getText();
        assertEquals(profile, "Profile", "Profile page fails to open");
    }
}