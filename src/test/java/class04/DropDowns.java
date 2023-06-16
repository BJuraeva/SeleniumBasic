package class04;

import Utils.CommonMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDowns extends CommonMethod {
    public static void main(String[] args) throws InterruptedException {
        String url = "https://www.facebook.com/";
        String browser = "chrome";
        openBrowserLaunchApplication(url, browser);

        //  click on create new account
        WebElement createNewAccount = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createNewAccount.click();

        Thread.sleep(2000);

        //  1. find the element associate with the dropdown
        WebElement days = driver.findElement(By.xpath("//select[@id='day']"));

        //  2.create an object of the select class and pass in the parameters the element dropdown
        Select sel = new Select(days);

       // 3.use method provided in select class to select the option that u desire
        sel.selectByVisibleText("8");

        Thread.sleep(2000);

        // another method
        sel.selectByValue("26");

        Thread.sleep(2000);

        // another method
        sel.selectByIndex(0);


    }
}
