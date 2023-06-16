package class09;

import Utils.CommonMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo2 extends CommonMethod {
    public static void main(String[] args) {
        String url = "https://jqueryui.com/droppable/";
        String browser = "chrome";
        openBrowserLaunchApplication(url, browser);

        // as the element inside the iframe we need to switch the focus
        driver.switchTo().frame(0);

        // find the draggable webElement
        WebElement dragable = driver.findElement(By.id("draggable"));

        // find the element where you want to drop
        WebElement dropable = driver.findElement(By.id("droppable"));

        // action class
        Actions action = new Actions(driver);
        action.dragAndDrop(dragable,dropable).perform();

    }
}
