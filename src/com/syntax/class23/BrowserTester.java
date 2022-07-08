package com.syntax.class23;

public class BrowserTester {
    public static void main(String[] args) {
        /* INSTEAD OF WRITING ALL THESE
        Chrome chrome = new Chrome();
        chrome.startBrowser();
        chrome.openURL("www.google.com");
        chrome.testLoginPage();
        chrome.closeBrowser();

        FireFox fireFox = new FireFox();
        fireFox.startBrowser();
        fireFox.openURL("www.google.com");
        fireFox.testLoginPage();
        fireFox.closeBrowser();
         */
        /*
        WebDriver webDriver = new Chrome(); //we can just change new Safari/new Edge/new FireFox object to test all the methods
        webDriver.startBrowser();
        webDriver.openURL("www.google.com");
        webDriver.testLoginPage();
        webDriver.closeBrowser();
         */

        WebDriver[] browsers = {new Chrome(), new Safari(), new FireFox(), new Edge()};
        for (WebDriver driver:browsers){
            driver.startBrowser();
            driver.openURL("www.google.com");
            driver.testLoginPage();
            driver.closeBrowser();
        }
        /* regular loop example
        for (int i=0; i< browsers.length; i++){
            browsers[i].startBrowser();
            browsers[i].openURL("www.google.com");
            browsers[i].testLoginPage();
            browsers[i].closeBrowser();
        }*/
    }
}
