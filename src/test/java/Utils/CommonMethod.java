package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class CommonMethod {
    public static WebDriver driver;
    public static void openBrowserLaunchApplication(String URL, String browser){

        switch (browser){
            case "chrome":
                driver=new ChromeDriver();
                break;

            case "firefox":
                driver=new FirefoxDriver();
                break;
        }
       // maximize the window
        driver.manage().window().maximize();

        //navigate to the url
        driver.get(URL);

        // implicit wait
        driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(20));
    }
    public static void closeBrowser(){
        if (driver!=null) {
            driver.quit();
        }
    }
    public static void sendText(String text, WebElement element){
        element.clear();
        element.sendKeys(text);
    }
    //method to select from dropdown(single select)
    public static void dropDownSelect(WebElement element, String byVisibleText) {
        var object = new Select(element);
        object.selectByVisibleText(byVisibleText);
        //System.out.println("DropDown selected Element is: " + byVisibleText);
    }
    public  static void takeScreenShot(String fileName) throws IOException {
        TakesScreenshot ts = (TakesScreenshot)driver;
        File ss = ts.getScreenshotAs(OutputType.FILE);
        String path = "C:\\Users\\16465\\IdeaProjects\\SeleniumBasic\\screenshot.testSyntax.png";
        try {
            FileUtils.copyFile(ss, new File(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
