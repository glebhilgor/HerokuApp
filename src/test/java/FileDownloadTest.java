import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.testng.Assert.assertTrue;

public class FileDownloadTest extends BaseTest{

    @Test
    public void fileDownload() {
        driver.get("http://the-internet.herokuapp.com/download");
        driver.findElement(By.partialLinkText("filename.txt")).click();
        final String location = "C:\\Downloads\\filename.txt";
        Path path = Paths.get(location);
        boolean isExist = Files.exists(path);
        assertTrue(isExist, "The file doesn't exist");
    }
}