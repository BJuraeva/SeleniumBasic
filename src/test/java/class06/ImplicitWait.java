package class06;

import Utils.CommonMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static Utils.CommonMethod.openBrowserLaunchApplication;

public class ImplicitWait  extends CommonMethod {
    public static void main(String[] args) throws InterruptedException {
        String url = "https://www.facebook.com/";
        String browser = "chrome";
        openBrowserLaunchApplication(url, browser);

        // declaring the implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //
        WebElement createNewAccountBtn = driver.findElement(By.xpath("//a[text()='Create new account']"));
        createNewAccountBtn.click();

        // send the first name
        WebElement firstName=driver.findElement(By.xpath("//input[@name='firstname']"));
        // firstName.sendKeys("Barno"); ==> instead we write
        sendText("Barno", firstName);
    }
}
