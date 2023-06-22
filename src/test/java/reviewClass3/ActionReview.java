package reviewClass3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static Utils.CommonMethod.driver;
import static Utils.CommonMethod.openBrowserLaunchApplication;

public class ActionReview {
    public static void main(String[] args) {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard";
        String browser = "chrome";
        openBrowserLaunchApplication(url, browser);

       // login into the website
        WebElement userName= driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");

        WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");

        WebElement loginBtn=driver.findElement(By.xpath("//input[@id='btnLogin']"));
         //loginBtn.click();

        // declare the instance
        Actions action =new Actions(driver);
        action.click(loginBtn).perform();
        WebElement leaveTab = driver.findElement(By.id("menu_leave_viewLeaveModule"));
        action.moveToElement(leaveTab).perform();
    }
}
