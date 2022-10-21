package driverConfig;

import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.BrowserMobProxyServer;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import driverConfig.BROWSER;
import driverConfig.DriverFactory;

public class BaseClass {
    public static WebDriver driver;
    public static BrowserMobProxyServer server;


    @BeforeClass
    public static void init() {
        driver = DriverFactory.getDriver(BROWSER.CHROMEPROXY);

    }

    @AfterClass
    public static void close() {
      //  driver.close();
        server.stop();
    }

    public static WebDriver getDriver() {
        return driver;
    }

}
