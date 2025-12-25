package driver;

import element.WebElement;
import locator.By;

public interface WebDriver {

    // Browser level actions
    void get(String url);
    void close();
    void quit();
    String getTitle();
    String getCurrentUrl();

    // Navigation
    void back();
    void forward();
    void refresh();

    // Finding element
    WebElement findElement(By by);
}