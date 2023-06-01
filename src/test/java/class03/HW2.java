package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    /*
Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D
Enter valid username
Leave password field empty
Click on login button
Verify error message with text “Password cannot be empty” is displayed.
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
//        driver.get to navigate to the website
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D");
//        maximize the screen
        driver.manage().window().maximize();

        Thread.sleep(2000);

        WebElement userName=driver.findElement(By.xpath("//input[@name='txtUsername']"));
        userName.sendKeys("Admin");


        WebElement logIn = driver.findElement(By.xpath("//input[contains(@id, 'Login')]"));
        logIn.click();

        WebElement passwordEmpty = driver.findElement(By.xpath("// span[text()='Password cannot be empty']"));

        Thread.sleep(2000);

        driver.quit();



    }
}
