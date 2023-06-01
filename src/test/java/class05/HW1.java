package class05;

import Utils.CommonMethod;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HW1 extends CommonMethod {
    /*http://practice.syntaxtechs.net/javascript-alert-box-demo.php
    click on the last alert
    send keys and accept it
     */
    public static void main(String[] args) throws InterruptedException {

        String url = "http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser = "chrome";

        openBrowserLaunchApplication(url, browser);
        Thread.sleep(2000);

        // Click on the last alert button "Click for prompt box" and send Hello!

        WebElement alert3Btn = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        alert3Btn.click();

        Alert confirmAlert3 = driver.switchTo().alert();

        Thread.sleep(2000);

        confirmAlert3.sendKeys("Hello!");

        Thread.sleep(2000);

        confirmAlert3.accept();
    }
}
