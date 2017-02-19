package pageobjects.media;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Ujjwal on 2/13/2017.
 */
public class AddNewMedia {
    WebDriver driver;

    @FindBy(id = "plupload-browse-button")
    WebElement selectFiles;

    public AddNewMedia(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void setSelectFiles(){
        selectFiles.click();

    }


}
