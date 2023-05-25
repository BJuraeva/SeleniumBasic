package class04;

import Utils.CommonMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButtons extends CommonMethod {
    public static void main(String[] args) throws InterruptedException {

        String url="http://practice.syntaxtechs.net/basic-radiobutton-demo.php";
        String  browser="chrome";

        openBrowserLaunchApplication(url,browser);
        Thread.sleep(2000);

        WebElement r1 =driver.findElement(By.xpath("//input[@value='Male' and @name='optradio']"));
        r1.click();

        boolean r1isSelected=r1.isSelected();
        System.out.println("The radio button Male is selected: "+r1isSelected);

        boolean r1isDisplayed = r1.isDisplayed();
        System.out.println("The radio button Male is displayed: "+ r1isDisplayed);

        boolean r1isEnabled = r1.isEnabled();
        System.out.println("The radio button Male is enabled: "+r1isEnabled);

        // deselect the male r1 button by clicking female r2
        WebElement r2 = driver.findElement(By.xpath("//input[@value='Female' and @name='optradio']"));
        r2.click();

        // check if the button r1 has been deselected
        r1isSelected = r1.isSelected();
        System.out.println("The radio button Male is selected: "+r1isSelected);

    }
}
