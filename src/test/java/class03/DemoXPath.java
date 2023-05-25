package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoXPath {
    public static void main(String[] args) throws InterruptedException {
        //         instance of the webDriver
        WebDriver driver= new ChromeDriver();
//        driver.get to navigate to the website
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
//        maximize the screen
        driver.manage().window().maximize();

        Thread.sleep(2000);
//        userName text Box through xpath
        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
//        password textBox

        WebElement password = driver.findElement(By.xpath("//input[@name='txtPassword']"));
        password.sendKeys("Hum@nhrm123");

//        login Btn
        WebElement loginBtn = driver.findElement(By.xpath("//input[contains(@id, 'Login')]"));
        loginBtn.click();

        WebElement pimTab=driver.findElement(By.xpath("(//a[@id='menu_pim_viewPimModule'])"));
        pimTab.click();

    }


}
