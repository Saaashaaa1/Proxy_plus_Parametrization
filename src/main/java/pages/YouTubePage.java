package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class YouTubePage {
    @FindBy(xpath = "//input[@id='search']")
    WebElement elementSearch;
    @FindBy(xpath = "//*[@id='search-icon-legacy']")
    WebElement elementButtonEnter;

    public YouTubePage (WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    public void sentKEYS() {
        elementSearch.sendKeys("no war");
        elementButtonEnter.click();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    }

