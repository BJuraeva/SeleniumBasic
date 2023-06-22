package class08;

import Utils.CommonMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW extends CommonMethod {
    /*
goto syntax hrms
login
click on recruitment
select a date on the calendar
     */
    public static void main(String[] args) {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserLaunchApplication(url,browser);

        // login into the website
        WebElement userName= driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginBtn=driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();
        WebElement recruitment = driver.findElement(By.xpath("//a[@id='menu_recruitment_viewRecruitmentModule']"));
        recruitment.click();
        WebElement selectDate = driver.findElement(By.id("candidateSearch_fromDate"));
        selectDate.click();

        WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select select1 = new Select(month);
        select1.selectByVisibleText("Mar");

        WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select select2 = new Select(year);
        select2.selectByValue("2016");

        boolean isfound=false;
        while (!isfound){
            List<WebElement> allDays = driver.findElements(By.xpath("//table/tbody/tr/td"));
            for (WebElement day : allDays) {
                String currentDay = day.getText();
                if (currentDay.equals("31")) {
                    day.click();
                }
            }
            isfound=true;
        }

    }
}
