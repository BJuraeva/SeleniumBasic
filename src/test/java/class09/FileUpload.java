package class09;

import Utils.CommonMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class FileUpload extends CommonMethod {
    public static void main(String[] args)  {
        String url = "https://the-internet.herokuapp.com/upload";
        String browser = "chrome";
        openBrowserLaunchApplication(url, browser);

        // find the element which you can click to upload the file
        WebElement fileUpload = driver.findElement(By.xpath("//input[@id='file-upload']"));

        // in order to send/upload  the file
        // you can send the path of that file in senKeys.
        // the file path will be different for everyone depending on their own system
        fileUpload.sendKeys("C:\\Users\\16465\\OneDrive\\Desktop\\INVITATION_DILSHODJON.docx");

    }
}
