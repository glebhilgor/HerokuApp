import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTest extends BaseTest{

    @Test
    public void fileUpload() {
        driver.get("http://the-internet.herokuapp.com/upload");
        driver.findElement(By.id("file-upload")).sendKeys("C:/Users/glebh/Desktop/Screenshot_1.png");
        driver.findElement(By.cssSelector("[value=Upload]")).click();
        String uploadedFile = driver.findElement(By.id("uploaded-files")).getText();
        assertEquals(uploadedFile, "Screenshot_1.png", "The file is not uploaded");
    }
}