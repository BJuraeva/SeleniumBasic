package class09;

import Utils.CommonMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JSExecuterdemo2 extends CommonMethod {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://amazon.com/";
        String browser = "chrome";
        openBrowserLaunchApplication(url, browser);

        // perform a scroll operation using java script
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // scroll down
        js.executeScript("window.scrollBy(0, 500)");

        // Thread.sleep for observation
        Thread.sleep(3000);

        // scroll up
        js.executeScript("window.scrollBy(0, -500)");

        // click on the dropdown "All" using from jsExecutor
        WebElement DD=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        Thread.sleep(3000);
        js.executeScript("arguments[0].click();",DD); // for some reason its not working


    }
}
