import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CheckBoxTest extends BaseTest {
    @Test
    public void checkTest() {

        driver.get("http://the-internet.herokuapp.com/checkboxes");
        List<WebElement> list = driver.findElements(By.xpath("//input[@type='checkbox']"));
        assertFalse(list.get(0).isSelected(), "Checkbox is selected");
        list.get(0).click();
        assertTrue(list.get(0).isSelected(), "Checkbox is not selected");
        assertTrue(list.get(1).isSelected(), "Checkbox is not selected");
        list.get(1).click();
        assertFalse(list.get(1).isSelected(), "Checkbox is selected");
    }
}