package class04;

import com.sun.security.jgss.GSSUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.css.CSSUnknownRule;

import static Utils.CommonMethod.driver;
import static Utils.CommonMethod.openBrowserLaunchApplication;

public class HW1 {
    /*
goto   http://practice.syntaxtechs.net/basic-select-dropdown-demo.php
select , tuesday, thursday and friday one by one
     */
    public static void main(String[] args) throws InterruptedException {
        String url = "http://practice.syntaxtechs.net/basic-select-dropdown-demo.php";
        String browser = "chrome";
        openBrowserLaunchApplication(url,browser);

        WebElement days = driver.findElement(By.xpath("//select[@id='select-demo']"));
        Select select = new Select(days);

        select.selectByVisibleText("Tuesday");
        Thread.sleep(2000);

        select.selectByValue("Thursday");
        Thread.sleep(2000);

        select.selectByVisibleText("Friday");
        Thread.sleep(2000);




    }
}
