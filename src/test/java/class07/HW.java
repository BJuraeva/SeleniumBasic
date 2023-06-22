package class07;

import Utils.CommonMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static Utils.CommonMethod.openBrowserLaunchApplication;

public class HW extends CommonMethod {
    /*
goto http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
login
click on PIM
from the table choose any ID
and print out the row number of that id
please make sure that ur code is dynamic enough to cater if another row gets deleted,
it still prints the row correctly
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
        WebElement pim = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        pim.click();

        List<WebElement> allID = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
        // looking for 54748A
        for(int i=0;i<allID.size();i++) {
            String id = allID.get(i).getText();
            if (id.equals("54748A")) {
                System.out.println("54748A is on row number " + (i + 1)); //54748A is on row number 10
            }
        }

    }
}
