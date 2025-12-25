package driver;

import element.WebElement;
import javascript.JavascriptExecutor;
import locator.By;

public class ChromeDriver implements WebDriver,JavascriptExecutor {

    @Override
    public void get(String url) {
        System.out.println("Opening Chrome browser with URL: " + url);
    }

    @Override
    public void close() {
        System.out.println("Closing current Chrome tab");
    }

    @Override
    public void quit() {
        System.out.println("Closing Chrome browser");
    }

    @Override
    public String getTitle() {
        return "Dummy Page Title";
    }

    @Override
    public String getCurrentUrl() {
        return "https://dummyurl.com";
    }

    @Override
    public void back() {
        System.out.println("Navigating back");
    }

    @Override
    public void forward() {
        System.out.println("Navigating forward");
    }

    @Override
    public void refresh() {
        System.out.println("Refreshing page");
    }

    @Override
    public WebElement findElement(By by) {
        System.out.println("Finding element using: " + by.getLocator());
        return new WebElement();
    }
    
    //javascript executor
    @Override
    public void executeScript(String script) {
        System.out.println("Executing JavaScript: " + script);
    }
}