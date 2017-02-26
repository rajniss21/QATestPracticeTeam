package pageobjects.posts;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Ujjwal on 2/13/2017.
 */
public class Posts {
    WebDriver driver;

    @FindBy(id = "title")
    WebElement title;

    @FindBy(id = "tinymce")
    WebElement paragaraph;

    @FindBy(id = "contanet-ifr")
    WebElement frame;

    @FindBy(id ="publish")
    WebElement publish;

    @FindBy(xpath = ".//*[@id='wpbody-content']/div[3]/h1")
    WebElement postheadingtext;

    public Posts(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void dotitle(String titletext){
        title.sendKeys(titletext);
    }
    public void paragraph(String paragraphText){
        driver.switchTo().frame(frame);
        paragaraph.sendKeys(paragraphText);
        driver.switchTo().parentFrame();
    }
    public void dopublish(){
        publish.click();
    }
    public String getSomeText(){
        String heading1=postheadingtext.getText();
        return heading1;
    }

}
