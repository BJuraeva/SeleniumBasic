package class03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    /*
Open chrome browser
Go to “http://practice.syntaxtechs.net/input-form-demo.php%E2%80%9D
fill in the complete form
     */

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
//        driver.get to navigate to the website
        driver.get("http://practice.syntaxtechs.net/input-form-demo.php");
//        maximize the screen
        driver.manage().window().maximize();

        Thread.sleep(2000);


    }
}
