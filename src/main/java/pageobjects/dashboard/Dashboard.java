package pageobjects.dashboard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by RajniSh on 2/12/2017.
 */
public class Dashboard {
    WebDriver driver;

    @FindBy(xpath = ".//*[@id='menu-dashboard']/a/div[3]")
    WebElement dashboardLink;
    @FindBy(xpath = ".//*[@id='menu-dashboard']/ul/li[2]/a")
    WebElement homeLink;
    @FindBy(xpath = ".//*[@id='wp-admin-bar-view-site']/a")
    WebElement visitSite;

    public Dashboard(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void gotoDashboardLink(){
        new Actions(driver).moveToElement(dashboardLink).build().perform();
    }
    public void gotoHomeLink(){
        new Actions(driver).moveToElement(homeLink).build().perform();
    }
    public void gotoVisitSiteLink(){
        new Actions(driver).moveToElement(visitSite).build().perform();
    }
}
