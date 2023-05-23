package class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    /*
navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
close the browser
     */
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();

        driver.findElement(By.id("customer.firstName")).sendKeys("Barno");
        driver.findElement(By.id("customer.lastName")).sendKeys("Islomova");
        driver.findElement(By.name("customer.address.street")).sendKeys("Shore Parkway");
        driver.findElement(By.name("customer.address.city")).sendKeys("Brooklyn");
        driver.findElement(By.name("customer.address.state")).sendKeys("NY");
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("11235");
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("6467772244");
        driver.findElement(By.name("customer.ssn"));
        driver.findElement(By.id("customer.username")).sendKeys("Barno");
        driver.findElement(By.id("customer.password")).sendKeys("IslomFamily");
        driver.findElement(By.id("repeatedPassword")).sendKeys("IslomFamily");

        String url = driver.getCurrentUrl();
        System.out.println(url);

        String title = driver.getTitle();
        System.out.println(title);

        driver.quit();



    }
}
