package pageobjects.user;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by RajniSh on 1/18/2017t.
 */
public class AddNewUser {
    WebDriver driver;

    @FindBy(id = "user_login")
    WebElement username;
    @FindBy(id = "email")
    WebElement email;
    @FindBy(id = "first_name")
    WebElement firstname;
    @FindBy(id = "last_name")
    WebElement lastname;
    @FindBy(id = "url")
    WebElement url;
    @FindBy(xpath = ".//*[@id='createuser']/table/tbody/tr[6]/td/button")
    WebElement passclick;

    @FindBy(id = "pass1-text")
    WebElement pass1text;
    @FindBy(id = "send_user_notification")
    WebElement send_user_notification;
    @FindBy(id = "role")
    WebElement role;
    @FindBy(id = "createusersub")
    WebElement createusersub;



    public AddNewUser(WebDriver driver) {
        this.driver = driver;
    }

    public void setUsername(String usernametext) {
        username.sendKeys(usernametext);
    }

    public void setEmail(String emailtext) {
        email.sendKeys(emailtext);
    }

    public void setFirstname(String firstnametext) {
        firstname.sendKeys(firstnametext);
    }

    public void setlastname(String lastnametext) {
        lastname.sendKeys(lastnametext);
    }

    public void setwebsite(String websitetext) {
        url.sendKeys(websitetext);
    }

    public void setPassclick() {
        passclick.click();
    }

    public void setPassword(String passwordtext) {

        pass1text.clear();
        pass1text.sendKeys(passwordtext);
        pass1text.clear();
        pass1text.sendKeys(passwordtext);

    }

    public void setSendusernotification() {
        send_user_notification.click();
    }

    public void setRole(String roletext) {
        Select dropdown = new Select(role);
        dropdown.selectByVisibleText(roletext);
    }

    public void setSubmitbutton() {
        createusersub.click();
    }


}




