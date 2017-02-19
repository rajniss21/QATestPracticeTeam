package pageobjects.dashboard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
    @FindBy(xpath=".//*[@id='menu-pages']/a/div[3]")
    WebElement pagesLink;

    @FindBy(xpath=".//*[@id='menu-pages']/ul/li[3]/a")
    WebElement addNewPageLink;

    @FindBy(xpath = ".//*[@id='menu-media']/a/div[3]")
    WebElement mediaPage;

    @FindBy(xpath = ".//*[@id='menu-media']/ul/li[3]/a")
    WebElement addNewMedia;

    @FindBy(xpath = ".//*[@id='menu-posts']/a/div[3]")
    WebElement posts;

    @FindBy(xpath = ".//*[@id='menu-posts']/ul/li[3]/a")
    WebElement addnewpost;

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
    public void gotoPagesLink(){
        new Actions(driver).moveToElement(pagesLink).build().perform();
    }
    public void gotoAddNewPageLink(){
        new Actions(driver).moveToElement(addNewPageLink).build().perform();
    }
    public void gotoMediaLibrary(){
    mediaPage.click();
    }
    public void gotoAddNewMedia(){
        addNewMedia.click();
    }
    public void gotoAddNewPost() {
        posts.click();
        addnewpost.click();

    }
}
