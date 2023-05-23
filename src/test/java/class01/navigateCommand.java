package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateCommand {
    public static void main(String[] args) throws InterruptedException {
        //  create the instance
        WebDriver driver=new ChromeDriver();

        // go to google.com
        driver.get("https://www.google.com");

        // maximize screen (bale to see url, tabs, and bookmarks)
        driver.manage().window().maximize();

        // slow down
        Thread.sleep(2000);


        //  navigate to facebook.com
        driver.navigate().to("https://www.facebook.com");

        // full screen mode (not able to se url, tabs, and bookmarks)
        driver.manage().window().fullscreen();

        //  slow down
        Thread.sleep(2000);

        //  refresh the page
        driver.navigate().refresh();

        // slow down
        Thread.sleep(1000);

        // go back to previous page
        driver.navigate().back();

        // slow down
        Thread.sleep(2000);

        // go to forward
        driver.navigate().forward();

        // close the browser
        driver.quit();

        // close the current tap
        driver.close();

    }
}
