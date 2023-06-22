package class06;

import Utils.CommonMethod;

import static Utils.CommonMethod.openBrowserLaunchApplication;

public class HW3 extends CommonMethod {
    /*
     http://practice.syntaxtechs.net/dynamic-data-loading-demo.php
     develop a function in common methods to select from dropdown(single select)
     */
    public static void main(String[] args)  {
        String url = "http://practice.syntaxtechs.net/dynamic-data-loading-demo.php";
        String browser = "chrome";
        openBrowserLaunchApplication(url,browser);

        // done in Util package in common methods class
    }
}
