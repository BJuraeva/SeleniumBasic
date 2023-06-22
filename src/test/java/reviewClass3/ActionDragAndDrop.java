package reviewClass3;

import Utils.CommonMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static Utils.CommonMethod.openBrowserLaunchApplication;

public class ActionDragAndDrop extends CommonMethod {
    public static void main(String[] args) {
        String url = "https://jqueryui.com/droppable/";
        String browser = "chrome";
        openBrowserLaunchApplication(url, browser);

        driver.switchTo().frame(0);
        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));
        Actions action = new Actions(driver);

        action.clickAndHold(draggable).moveToElement(droppable).release().build().perform();

    }
}
