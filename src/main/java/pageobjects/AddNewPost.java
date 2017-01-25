package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Genelia on 18/01/2017.
 */
public class AddNewPost {

    WebDriver driver;

    @FindBy(id = "title")
    WebElement title;

    @FindBy(id = "tinymce")
    WebElement paragraph;

    @FindBy(id = "publish")
    WebElement publish;

    public AddNewPost(WebDriver driver) {
        this.driver = driver;
    }
    public void doAddNewPost() {
        title.sendKeys("chandagiri is beautiful and fun");
        paragraph.sendKeys("chandagiri is located in thankot .you can view changagiri hills by cable car");
        publish.click();
    }
}




