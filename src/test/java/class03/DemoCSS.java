package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoCSS {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/login/");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        // click on create new account using CSS
        WebElement createNewAccount = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createNewAccount.click();


        Thread.sleep(2000);

        // enter the first name using CSS
        WebElement firstName= driver.findElement(By.cssSelector("input[name='firstname']"));
        firstName.sendKeys("moazzam");

    }
}
