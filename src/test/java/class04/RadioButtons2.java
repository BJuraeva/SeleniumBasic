package class04;

import Utils.CommonMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RadioButtons2 extends CommonMethod {
    public static void main(String[] args) throws InterruptedException {

        String url="http://practice.syntaxtechs.net/basic-radiobutton-demo.php";
        String  browser="chrome";

        openBrowserLaunchApplication(url,browser);
        Thread.sleep(2000);

        List<WebElement> ageGroup = driver.findElements(By.xpath("//input[@name='ageGroup']"));

        String option = "15 - 50";

        for(WebElement age : ageGroup){
            String value = age.getAttribute("value");
            if(value.equals(option)){
                age.click();
                break;
            }
        }
    }

}
