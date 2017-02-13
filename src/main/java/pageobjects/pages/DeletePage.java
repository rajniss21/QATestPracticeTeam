package pageobjects.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by RajniSh on 2/13/2017.
 */
public class DeletePage {
    WebDriver driver;
    @FindBy(xpath= ".//*[@id='post-84']/td[1]")
    WebElement checkBox;
    @FindBy(id = "bulk-action-selector-top")
    WebElement choose;
    @FindBy(id = "doaction")
    WebElement apply;

    public DeletePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    public void clickOnCheckbox(){
        checkBox.click();
    }
    public void clickOnChooseAction(String actiontext){
        Select dropdown=new Select(choose);
        dropdown.selectByVisibleText(actiontext);
    }
     public void clickOnApply(){
         JavascriptExecutor js = ((JavascriptExecutor) driver);

         js.executeScript("scroll(0, -250);");

         WebDriverWait w = new WebDriverWait(driver,15);
         w.until(ExpectedConditions.elementToBeClickable(apply));
         apply.click();

     }





}
