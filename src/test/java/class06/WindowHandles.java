package class06;

import Utils.CommonMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class WindowHandles extends CommonMethod {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://accounts.google.com/signup";
        String browser = "chrome";
        openBrowserLaunchApplication(url, browser);

        // click on the help and privacy button
        WebElement helpBtn = driver.findElement(By.linkText("Help"));
        helpBtn.click();

        WebElement privacyBtn = driver.findElement(By.linkText("Privacy"));
        privacyBtn.click();

        //get the window handle of the main page and print on console and save it for later use
        String mainPageHandle = driver.getWindowHandle();
        System.out.println("main page handle is: "+mainPageHandle);

        // get all page handles
        Set<String> allPageHandles = driver.getWindowHandles();
        for (String pageHandle:allPageHandles){
            driver.switchTo().window(pageHandle);
            String title = driver.getTitle();
            // switch the focus of the driver to google help page
            if (title.equalsIgnoreCase("Google Account Help")){
                break;
            }
            // print the titles associated with each window handle
            // System.out.println("the title associated with "+ pageHandle+" is "+title);
        }
        // when focus is shifted to the correct page
        System.out.println("the current page under focus is: "+driver.getTitle());

        // after switching to the page google account help, we can deal with any element we want to in a regular manner

        // switch my focus back to the main page
        driver.switchTo().window(mainPageHandle);

        // check the focus
        System.out.println("focus is on: "+driver.getTitle());
    }
}
