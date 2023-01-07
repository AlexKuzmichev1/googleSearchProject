package Utils.WebDriverUtils;

import io.github.bonigarcia.wdm.managers.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;

public class BrowserFactory {

    private enum BrowserList {
        CHROME, FIREFOX, SAFARI
    }

    public static WebDriver createBrowser(String browserName) {
        WebDriver driver;
        BrowserList browserType = BrowserList.valueOf(browserName.toUpperCase());

        switch (browserType) {

            case CHROME:
                driver = new ChromeDriverManager().create();
                break;
            case FIREFOX:
                driver = new FirefoxDriverManager().create();
                break;
            case SAFARI:
                driver = new SafariDriverManager().create();
                break;
            default:
                throw new UnreachableBrowserException(browserName);
        }
        return driver;
    }
}
