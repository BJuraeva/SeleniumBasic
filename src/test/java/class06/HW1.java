package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Utils.CommonMethod.driver;
import static Utils.CommonMethod.openBrowserLaunchApplication;

public class HW1 {
    /*
    goto  http://practice.syntaxtechs.net/dynamic-elements-loading.php
    click on start
    print the text  "welcome syntax technologies "on console
     */

    public static void main(String[] args) {
        String url = "http://practice.syntaxtechs.net/dynamic-elements-loading.php";
        String browser = "chrome";
        openBrowserLaunchApplication(url,browser);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement startBtn = driver.findElement(By.id("startButton"));
        startBtn.click();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h4[text()='Welcome Syntax Technologies']"),"Welcome Syntax Technologies"));

        WebElement textVisible = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        System.out.println(textVisible.getText());
    }
}
