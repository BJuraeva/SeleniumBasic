package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    /*
Open chrome browser
Go to “http://practice.syntaxtechs.net/input-form-demo.php%E2%80%9D
fill in the complete form
     */

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();

        // driver.get to navigate to the website
        driver.get("http://practice.syntaxtechs.net/input-form-demo.php");

        // maximize the screen
        driver.manage().window().maximize();

        Thread.sleep(2000);

        WebElement firstName = driver.findElement(By.cssSelector("input[name='first_name']"));
        firstName.sendKeys("Barno");

        WebElement lastName = driver.findElement(By.cssSelector("input[name='last_name']"));
        lastName.sendKeys("Juraeva");

        WebElement email = driver.findElement(By.cssSelector("input[placeholder='E-Mail Address']"));
        email.sendKeys("bnd@gmail.com");

        WebElement phoneNumber = driver.findElement(By.cssSelector("input[name='phone']"));
        phoneNumber.sendKeys("444-555-5665");

        WebElement address = driver.findElement(By.cssSelector("input[name='address']"));
        address.sendKeys("3001 Shore Parkway");

        WebElement city = driver.findElement(By.cssSelector("input[name='city']"));
        city.sendKeys("Brooklyn");

        WebElement state = driver.findElement(By.xpath("//option[text()='New York']"));
        state.click();

        WebElement zipCode = driver.findElement(By.cssSelector("input[name='zip']"));
        zipCode.sendKeys("11235");

        WebElement webSite = driver.findElement(By.cssSelector("input[name='website']"));
        webSite.sendKeys("syntax.com");

        WebElement hosting = driver.findElement(By.cssSelector("input[value='yes']"));
        hosting.click();

        WebElement project = driver.findElement(By.cssSelector("textarea[name='comment']"));
        project.sendKeys("Selenium Home Work1, Class03");

        WebElement submit = driver.findElement(By.cssSelector("button[type='submit']"));
        submit.click();





    }
}
