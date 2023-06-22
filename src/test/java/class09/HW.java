package class09;


import Utils.CommonMethod;

import java.io.IOException;

import static Utils.CommonMethod.openBrowserLaunchApplication;

public class HW extends CommonMethod {
    /*
   1. create the method in Common methods for screen shot
    it should take the name as a parameter
    ====================================================
    options = Options()
    Disable cookies
    options.add_argument("--disable-cookies")

    2. Create a new ChromeDriver instance with the options
     driver = webdriver.Chrome(options=options)
     */

    public static void main(String[] args) throws IOException, InterruptedException {
        String url = "http://practice.syntaxtechs.net/basic-radiobutton-demo.php";
        String browser = "chrome";
        openBrowserLaunchApplication(url, browser);
        Thread.sleep(2000);
        takeScreenShot("practice");
        Thread.sleep(2000);
        driver.quit();



    }
}
