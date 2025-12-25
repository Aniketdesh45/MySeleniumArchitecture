package tests;

import base.BaseTest;
import pages.LoginPage;
import utils.TestData;

public class LoginTest extends BaseTest {

    public static void main(String[] args) {

        LoginTest test = new LoginTest();
        test.setUp();

        LoginPage login = new LoginPage(test.driver);
        login.login(
            TestData.getUsername(),
            TestData.getPassword()
        );

        test.tearDown();
    }
}
