package pageobjects.dashboard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by RajniSh on 2/12/2017.
 */
public class Dashboard {
    WebDriver driver;

    @FindBy(xpath = ".//*[@id='menu-dashboard']/a/div[3]")
    WebElement dashboardLink;
}
