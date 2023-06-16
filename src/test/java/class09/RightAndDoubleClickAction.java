package class09;

import Utils.CommonMethod;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RightAndDoubleClickAction extends CommonMethod {
    public static void main(String[] args) {
        String url = "http://demo.guru99.com/test/simple_context_menu.html";
        String browser = "chrome";
        openBrowserLaunchApplication(url, browser);

        // find the element with right click
        WebElement rightClickBtn = driver.findElement(By.xpath("//span[text()='right click me']"));

        // Action Class
         Actions action = new Actions(driver);

        // perform the right click
        // right click is also called context click
        action.contextClick(rightClickBtn).perform();

        // find an element which is edit option
        WebElement editOpt = driver.findElement(By.xpath("//span[text()='Edit']"));
        action.click(editOpt).perform();

        // on click edit alert appears
        // in order to handle the alert we can just except it
        Alert alert = driver.switchTo().alert();
        alert.accept();

        // find WebElement to double-click on
        WebElement doubleClick = driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
        action.doubleClick(doubleClick).perform();



    }
}
