package base;

import driver.ChromeDriver;
import driver.WebDriver;
import utils.ConfigReader;

public class BaseTest {

    protected WebDriver driver;

    public void setUp() {
        driver = new ChromeDriver();
        driver.get(ConfigReader.getUrl());
    }

    public void tearDown() {
        driver.quit();
    }
}