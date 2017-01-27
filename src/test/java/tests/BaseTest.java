package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.login.Login;
import java.util.concurrent.TimeUnit;

/**
 * Created by Ujjwal on 1/23/2017.
 */
public class BaseTest {

     protected Login login;
     protected WebDriver driver;

    @Before
    public void setup(){
        System.setProperty("webdriver.firefox.marionette","C:\\Leapfrog\\geckodriver.exe");
        driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://localhost/wordpress/wp-admin");
        login=new Login(driver);
      //  PageFactory.initElements(driver,login);
    }

    @After
    public void teardown(){
driver.quit();
    }
}
