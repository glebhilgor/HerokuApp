import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropDownTest extends BaseTest {


    @Test
    public void dropDownTest() {

        driver.get("http://the-internet.herokuapp.com/dropdown");
        WebElement element = driver.findElement(By.id("dropdown"));
        Select dropDownTest = new Select(element);
        dropDownTest.selectByVisibleText("Option 1");
        boolean isSelected1 = dropDownTest.getFirstSelectedOption().isSelected();
        assertTrue(isSelected1, "There is no any selected option");
        dropDownTest.selectByVisibleText("Option 2");
        boolean isSelected2 = dropDownTest.getFirstSelectedOption().isSelected();
        assertTrue(isSelected2, "There is no any selected option");
        int optionsQuantity = driver.findElements(By.xpath("//option")).size();
        assertEquals(optionsQuantity, 3, "Quantity of the options are not 3");

    }
}