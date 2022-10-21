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
        driver = DriverFactory.getDriver(BROWSER.CHROMEPROXY); // (For Paramererized+ResourceBundle change to BROWSER.CHROME)
                                                               //(For Proxy change to BROWSER.CHROMEPROXY

    }

    @AfterClass
    public static void close() {
      //  driver.close();(For Proxy_Homework comment)
        server.stop();
    }

    public static WebDriver getDriver() {
        return driver;
    }

}
