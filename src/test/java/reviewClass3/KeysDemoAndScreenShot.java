package reviewClass3;

import Utils.CommonMethod;
import org.openqa.selenium.*;

import java.io.IOException;

public class KeysDemoAndScreenShot extends CommonMethod {
    public static void main(String[] args) throws InterruptedException, IOException {
        String url = "https://the-internet.herokuapp.com/key_presses";
        String browser = "chrome";
        openBrowserLaunchApplication(url, browser);

        WebElement textBox = driver.findElement(By.id("target"));
        textBox.sendKeys(Keys.ENTER);

        Thread.sleep(2000);
        textBox = driver.findElement(By.id("target"));
        textBox.sendKeys(Keys.TAB);

        Thread.sleep(2000);
        textBox = driver.findElement(By.id("target"));
        textBox.sendKeys(Keys.ARROW_DOWN);

        // taking screen shot
        takeScreenShot("MYSS"); // from commonMethods

        // TakesScreenshot ts=(TakesScreenshot) driver;
        // File ss = ts.getScreenshotAs(OutputType.FILE);
        // FileUtils.copyFile(ss,new File("C:\\Users\\16465\\IdeaProjects\\SeleniumBasic\\screenshot\\abc.png"));


    }

}
