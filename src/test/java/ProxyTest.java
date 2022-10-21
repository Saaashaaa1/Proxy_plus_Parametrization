import driverConfig.BROWSER;
import driverConfig.BaseClass;
import driverConfig.DriverFactory;
import models.AGENTS;
import models.UserAgents;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import pages.YouTubePage;
import util.Screen;

public class ProxyTest extends BaseClass {
    static YouTubePage youtubePage;
    @BeforeClass
public static void iinit(){

        AGENTS.AgentType(UserAgents.IPHONE);
    if (youtubePage ==null){
        youtubePage=new YouTubePage(driver);
    }

    }
    @Test
    public void testYouTube(){
driver.get("https://www.youtube.com/");
        youtubePage.sentKEYS();
        Screen.takeScreen(driver,"Screen");
    }

    @AfterClass
    public static void end(){
        driver.close();
    }

}
