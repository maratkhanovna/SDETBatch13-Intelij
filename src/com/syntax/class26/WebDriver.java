package com.syntax.class26;
/*
    Create a WebDriver Interface that will have the following unimplemented behaviour:
    openBrowser(), closeBrowser(), maximizeWindow(), findElement().
    Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
 */

public interface WebDriver {
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("to open  browser set property first then create a new object ChromeDriver");
    }

    @Override
    public void closeBrowser() {
        System.out.println("to close  browser call method .quit()");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("to maximize window call methods .manage().window().maximize()");
    }

    @Override
    public void findElement() {
        System.out.println("to find element call method .findElement(By.any locator(name of locator)");
    }
}
class FireFox implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("to open  browser set property first then create a new object FireFox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("to close  browser call method .quit()");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("to maximize window call methods .manage().window().maximize()");
    }

    @Override
    public void findElement() {
        System.out.println("to find element call method .findElement(By.any locator(name of locator)");
    }
}
