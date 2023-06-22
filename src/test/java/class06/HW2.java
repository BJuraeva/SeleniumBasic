package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static Utils.CommonMethod.driver;
import static Utils.CommonMethod.openBrowserLaunchApplication;

public class HW2 {
    /*
    goto http://practice.syntaxtechs.net/dynamic-data-loading-demo.php
    click on get new user
    print the firstname of user
     */
    public static void main(String[] args) {
        String url = "http://practice.syntaxtechs.net/dynamic-data-loading-demo.php";
        String browser = "chrome";
        openBrowserLaunchApplication(url,browser);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement getNewUser = driver.findElement(By.xpath("//button[text()='Get New User']"));
        getNewUser.click();

        WebElement firstName = driver.findElement(By.xpath("//p[contains(text(),'First Name')]"));
        System.out.println(firstName.getText());
    }
}
