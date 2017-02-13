package pageobjects.media;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pageobjects.dashboard.Dashboard;

/**
 * Created by Ujjwal on 2/13/2017.
 */
public class MediaLibrary {
    WebDriver driver;

    @FindBy(id = "cb-select-6")
    WebElement checkBoxOne;

    @FindBy(id = "bulk-action-selector-top")
    WebElement selector;

    @FindBy(id = "doaction")
    WebElement apply;

    public MediaLibrary(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void gotoMediaLibraries(){
        Dashboard dashboard=new Dashboard(driver);
        dashboard.gotoMediaLibrary();
    }
    public void clickCheckBox(){
        checkBoxOne.click();
    }
    public void setSelector(String selectortext){
        Select dropdown=new Select(selector);
        dropdown.selectByVisibleText(selectortext);

    }
    public void pressApply(){
        apply.click();
    }


}
