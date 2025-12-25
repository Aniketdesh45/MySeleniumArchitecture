package pages;

import driver.WebDriver;
import element.WebElement;
import locator.By;

public class LoginPage {

    WebDriver driver;

    // Locators
    By username = By.id("username");
    By password = By.id("password");
    By loginBtn = By.id("login");

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void enterUsername(String user) {
        driver.findElement(username).sendKeys(user);
    }

    public void enterPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    public void clickLogin() {
        driver.findElement(loginBtn).click();
    }

    public void login(String user, String pass) {
        enterUsername(user);
        enterPassword(pass);
        clickLogin();
    }
}