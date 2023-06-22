package reviewClass3;

import Utils.CommonMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;

public class DeltaCalenderDemo extends CommonMethod {
    public static void main(String[] args) throws IOException {
        String url = "https://www.delta.com/";
        String browser = "chrome";
        openBrowserLaunchApplication(url, browser);

        // locate the calender
        WebElement calender = driver.findElement(By.xpath("//div[@role='button']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // click on calender
        js.executeScript("arguments[0].click();",calender);

        // get the month
        WebElement month = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']"));

        boolean found=false;
        while(!found){
            String currentMonth = month.getText();
            if(currentMonth.equals("September")){
                js.executeScript("arguments[0].style.border='5px solid pink'",month);
                found=true;

            }
            else {
                // next button
                WebElement nxtBtn = driver.findElement(By.xpath("//span[text()='Next']"));
                nxtBtn.click();
            }
        }
        // get the date
        List<WebElement> Dates = driver.findElements(By.xpath("//table/tbody/tr/td"));
        for(WebElement date: Dates){
            String dd= date.getText();
            if(dd.equals("17")){
                date.click();
                break;
            }
        }
        takeScreenShot("selecteddate");

    }
}
