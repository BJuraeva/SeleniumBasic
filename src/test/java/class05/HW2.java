package class05;

import Utils.CommonMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static Utils.CommonMethod.openBrowserLaunchApplication;

public class HW2 extends CommonMethod {
    /*
    goto https://chercher.tech/practice/frames
click on check box
then select bay cat from drop down
then enter text in text box (edited)
     */

    public static void main(String[] args) throws InterruptedException {
        String url = "https://chercher.tech/practice/frames";
        String browser = "chrome";
        openBrowserLaunchApplication(url, browser);


        driver.switchTo().frame("frame1");

        driver.switchTo().frame("frame3");
        WebElement checkBox = driver.findElement(By.xpath("//input[@id='a']"));
        checkBox.click();

        Thread.sleep(2000);

        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='animals']"));

        Select select = new Select(dropdown);
        select.selectByVisibleText("Baby Cat");

        Thread.sleep(2000);

        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame1");
        WebElement textBox = driver.findElement(By.xpath("//input"));
        textBox.sendKeys("hello kitten");

        Thread.sleep(2000);



    }
}
