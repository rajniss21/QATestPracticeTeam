package tests;

import org.apache.bcel.generic.NEW;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageobjects.AddNewUser;
import org.openqa.selenium.support.PageFactory;
import pageobjects.AddNewPage;
import pageobjects.AddNewPost;
import pageobjects.Dashboard;
import pageobjects.Login;

import java.sql.Driver;

/**
 * Created by Ujjwal on 1/18/2017.
 */
public class LoginTest extends BaseTest{
    @Test
    public void testThatLoginWorks() {
        login.setUsername("admin");
        login.setPassword("admin");
        login.setLogin();
    }
    @Test
    public void testThatLoginDosentWork(){
        login.setUsername("admin1");
        login.setPassword("admin");
        login.setLogin();

    }

}
