package pageobjects.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageobjects.dashboard.Dashboard;

/**
 * Created by RajniSh on 2/12/2017.
 */
public class AddNewPage {
    WebDriver driver;
    @FindBy(id = "title")
    WebElement addtitle;
    @FindBy(id = "tinymce")
    WebElement paragraphBody;
    @FindBy(id ="publish")
    WebElement publish;

    public AddNewPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    public void doAddTitle(String addtitletext){
        addtitle.sendKeys(addtitletext);
    }
    public void addParagraph(String addparagraphtext){
        paragraphBody.sendKeys(addparagraphtext);
    }
    public void clickPublishButton(){
        publish.click();
    }
}
