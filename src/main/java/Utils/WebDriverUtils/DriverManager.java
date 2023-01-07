package Utils.WebDriverUtils;

import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class DriverManager {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = BrowserFactory.createBrowser("chrome");
            DriverManager.driver.manage().window().maximize();
            DriverManager.driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(5000));

        }
        return driver;
    }

    public static void goToAddress(String urlAddress) {
        driver.get(urlAddress);
    }

    public static void closeDriver() {
        driver.close();
        driver.quit();
        driver = null;
    }
}
