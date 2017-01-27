package pageobjects.dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by superuser on 1/18/2017.
 */
public class Dashboard {
    WebDriver driver;

    @FindBy(xpath=".//*[@id='menu-dashboard']/a/div[3]")
    WebElement homeLink;

    @FindBy(xpath=".//*[@id='menu-posts']/a/div[3]")
    WebElement posts;

    @FindBy(xpath=".//*[@id='menu-posts']/ul/li[3]/a")
    WebElement addNewPostLink;

    @FindBy(xpath=".//*[@id='menu-pages']/a/div[3]")
    WebElement pages;

    @FindBy(xpath=".//*[@id='menu-pages']/ul/li[3]/a")
    WebElement addNewPageLink;

    @FindBy(xpath=".//*[@id='menu-user']/a/div[3]")
    WebElement users;

    @FindBy(xpath=".//*[@id='menu-user']/ul/li[3]/a")
    WebElement addNewUserLink;

    @FindBy(xpath=".//*[@id='wpbody-content']/div[3]/h1")
    WebElement dashboardHeadingText;

    public Dashboard(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void gotohomeLink() {
        homeLink.click();
    }

    public void gotoPosts() {
        posts.click();
    }

    public void gotoAddNewPost() {
        addNewPostLink.click();
    }

    public void gotoPages(){
        pages.click();
    }

    public void gotoAddNewPages(){
        addNewPageLink.click();
    }

    public void gotoUsers(){
        users.click();
    }

    public void gotoAddNewUser() {
       addNewUserLink.click();
    }

    public String getSomeText(){
       String heading=  dashboardHeadingText.getText();
       return heading;
    }

}


