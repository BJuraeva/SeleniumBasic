package class04;

import Utils.CommonMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckBox extends CommonMethod {
    public static void main(String[] args) throws InterruptedException {

        String url = "http://practice.syntaxtechs.net/basic-checkbox-demo.php";
        String browser = "chrome";
        openBrowserLaunchApplication(url, browser);
        Thread.sleep(2000);

        // check the checkbox if is not already not checked
        WebElement c1 = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));

        if(!c1.isSelected()){
            c1.click();
        }

        List<WebElement> options = driver.findElements(By.xpath("//input[@class='cb1-element']"));

        for (WebElement option:options){
            String value = option.getAttribute("value");
            if (value.equals("Option-3")) { // if we remove if condition it will check all boxes
                option.click();
                break;
            }
        }
    }
}
