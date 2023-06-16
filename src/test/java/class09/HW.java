package class09;


import java.io.IOException;

import static Utils.CommonMethod.openBrowserLaunchApplication;

public class HW {
    /*
   1. create the method in Common methods for screen shot
    it should take tle name as a parameter
    ====================================================
    options = Options()
    Disable cookies
    options.add_argument("--disable-cookies")

    2. Create a new ChromeDriver instance with the options
     driver = webdriver.Chrome(options=options)
     */

    public static void main(String[] args) throws IOException {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserLaunchApplication(url, browser);
    }
}
