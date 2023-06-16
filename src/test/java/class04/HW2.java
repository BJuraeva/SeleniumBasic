package class04;

import org.apache.commons.io.input.TaggedReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.TreeMap;

import static Utils.CommonMethod.driver;
import static Utils.CommonMethod.openBrowserLaunchApplication;

public class HW2 {
    /*
 goto facebook.com
 click on create account
 and select your  date of birth using select class
     */
    public static void main(String[] args) throws InterruptedException {
        String url = "https://www.facebook.com";
        String browser = "chrome";
        openBrowserLaunchApplication(url, browser);

        WebElement createAcc = driver.findElement(By.xpath("//a[text()='Create new account']"));
        createAcc.click();

        WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
        month.click();
        Select sel1 = new Select(month);
        sel1.selectByVisibleText("Jul");
        Thread.sleep(2000);

        WebElement date = driver.findElement(By.xpath("//select[@name='birthday_day']"));
        date.click();
        Select sel2 = new Select(date);
        sel2.selectByValue("7");
        Thread.sleep(2000);

        WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
        year.click();
        Select sel3 = new Select(year);
        sel3.selectByValue("2011");








    }
}
