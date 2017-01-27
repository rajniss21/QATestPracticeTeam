package pageobjects.page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by thapa on 1/18/2017.
 */
public class AddNewPage {
    WebDriver driver;
    @FindBy (id = "title")
    WebElement addtitle;

    @FindBy (id = "tinymce")
    WebElement pagecontent;

    @FindBy (xpath = ".//*[@id='publish']")
    WebElement publishpage;

    @FindBy (id = "post-preview")
    WebElement preview;

    @FindBy(id = "content_ifr")
    WebElement frame;

    @FindBy(id = "tinymce")
    WebElement body;

    public AddNewPage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    public void doAddtitle(String addtitletext) {
        addtitle.sendKeys(addtitletext); }

    public void addpagecontent(String addpagecontenttext){
        driver.switchTo().frame(frame);
        body.sendKeys(addpagecontenttext);
        driver.switchTo().parentFrame();
    }

    public void dopublishpage(){
        publishpage.click();
    }

    public void seepreview() {
        preview.click();
    }









}
