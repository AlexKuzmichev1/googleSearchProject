package Tests;

import Utils.WebDriverUtils.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static Utils.WebDriverUtils.DriverManager.closeDriver;

public abstract class BaseTest {

    @BeforeMethod
    public void setUp() {
        DriverManager.getDriver();
        DriverManager.goToAddress("https://www.google.com/");
    }

    @AfterMethod
    public void tearDown() {
        closeDriver();
    }
}
