package class09;

import Utils.CommonMethod;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class ScreenShot extends CommonMethod {
    public static void main(String[] args) throws IOException {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserLaunchApplication(url, browser);

        // find the log in btn
        WebElement loginBtn= driver.findElement(By.xpath("//input[@id='btnLogin']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();",loginBtn);

        // take the screen shot
        // 1. declare the instance
        TakesScreenshot ts=(TakesScreenshot) driver;

        // 2. take screen shot as output type FILE
        File screenShot = ts.getScreenshotAs(OutputType.FILE);

        // 3. save it in your computer (creating file in my project)
        FileUtils.copyFile(screenShot,new File("C:\\Users\\16465\\IdeaProjects\\SeleniumBasic\\screenshot\\testSyntax1.png"));

    }
}
