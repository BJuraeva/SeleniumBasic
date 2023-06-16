package class09;

import Utils.CommonMethod;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class JSExecuterdemo1 extends CommonMethod {
    public static void main(String[] args) {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserLaunchApplication(url, browser);

        // find the text box user name
        WebElement userNameTxtBox = driver.findElement(By.xpath("//input[@id='txtUsername']"));

        // JSExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // script
        // the script should draw a border around the WebElement
        // js.executeScript("arguments[0].style.backgroundColor='green'",userNameTxtBox);

        js.executeScript("arguments[0].style.border='2px solid green'", userNameTxtBox); // we can change 2px to 1,2,3,4,5...
    }
}
