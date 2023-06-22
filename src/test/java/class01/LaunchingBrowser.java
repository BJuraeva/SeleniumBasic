package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class LaunchingBrowser {
    /*
       Task:
       navigate to google.com
     */
    public static void main(String[] args) throws InterruptedException {

// declare the instance
        WebDriver driver=new ChromeDriver();

//  use .get(url) to navigate to the desired url
        driver.get("https://www.google.com");

// get current URL
        String currentUrl=driver.getCurrentUrl();

// print on the console
        System.out.println("The current url of the website is: "+currentUrl);

// maximize the window
        driver.manage().window().maximize();

// get the title of the page
        String title = driver.getTitle();

// print on the console
        System.out.println("The tittle of the webpage is: "+title);

// add sleep time for 5sec
        Thread.sleep(5000);

// close the web-browser
        driver.quit();

    }
}
