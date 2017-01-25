package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

import java.sql.Driver;

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
    public void setUsername() {
        username.sendKeys("admin");
    }
    public void setEmail() {
        email.sendKeys("pradhanrajnishbltr21@outlook.com");
    }
    public void setFirstname() {
        firstname.sendKeys("Rajnish");
    }
    public void setlastname(){
        lastname.sendKeys("Pradhan");
    }
    public  void setwebsite(){
        url.sendKeys("www.rajnish.com.np");
    }
    public  void setPassword(){
        pass1text.sendKeys("admin");
    }
    public  void setSendusernotification(){
        send_user_notification.click();
    }
    public  void setRole(){
        role.sendKeys("adminstrator");
    }
    public  void setSubmitbutton(){
        createusersub.click();
    }

}
