package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        // declare instance
        WebDriver driver=new ChromeDriver();

        // navigate to the HRML
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");

        // maximize the window
        driver.manage().window().maximize();

        Thread.sleep(3000);

        // find the element username TextBox
       WebElement userNameTextBox= driver.findElement(By.id("txtUsername"));
       userNameTextBox.sendKeys("Admin");

       // they both the same
       // driver.findElement(By.id("textUsername")).sendKeys("Admin");

        // slow down
        Thread.sleep(2000);

        //after sending the username to the textBox clear the text box
        userNameTextBox.clear();

        // sending username again
        userNameTextBox.sendKeys("Admin");

        // find the password
        WebElement pass = driver.findElement(By.name("txtPassword"));
        pass.sendKeys("Hum@nhrm123");


        // find the login btn
        WebElement loginBtn= driver.findElement(By.className("button"));
        loginBtn.click();

        // get the Welcome Admin message
        WebElement message = driver.findElement(By.linkText("Welcome Admin"));
        String text=message.getText();
        System.out.println(text);

        // get Recruitment page
        driver.findElement(By.partialLinkText("Recru")).click();

        // if their multiple elements with a same tagName selenium will pick the first one it finds
        driver.findElement(By.tagName("button"));



    }
}
