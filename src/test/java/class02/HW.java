package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW {
    /*
(only use XPATH)
navigate to fb.com
click on create new account
fill up all the textboxes
close the popup
close the browser

Note : in order for ur code to work
u have to put Thread.sleep(2000) after clicking on Create new account

     */
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        WebElement createNewAccount= driver.findElement(By.xpath("//a[text()='Create new account']"));
        createNewAccount.click();

        Thread.sleep(2000);

        WebElement firstName=driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("Barno");


        WebElement lastName= driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys("Islomova");

        WebElement email=driver.findElement(By.xpath("//input[@name='reg_email__']"));
        email.sendKeys("barno@gmail.com");

        WebElement reEnterEmail= driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
        reEnterEmail.sendKeys("barno@gmail.com");

        WebElement password=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
        password.sendKeys("Isl@mov123");

        WebElement birthdayMonth=driver.findElement(By.xpath("//option[text()='Jul']"));
        birthdayMonth.click();

        WebElement birthdayDate=driver.findElement(By.xpath("//option[text()='19']"));
        birthdayDate.click();

        WebElement birthdayYear=driver.findElement(By.xpath("//option[text()='1986']"));
        birthdayYear.click();

        WebElement gender = driver.findElement(By.xpath("//label[text()='Female']"));
        gender.click();

        WebElement signUp = driver.findElement(By.xpath("//button[text()='Sign Up']"));
        signUp.click();

        Thread.sleep(2000);

        WebElement popUpClose= driver.findElement(By.xpath("//img[@src='https://static.xx.fbcdn.net/rsrc.php/v3/yO/r/zgulV2zGm8t.png']"));
        popUpClose.click();

        Thread.sleep(2000);

        driver.quit();





    }
}
