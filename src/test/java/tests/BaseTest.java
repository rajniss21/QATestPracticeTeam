package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.login.Login;
import java.util.concurrent.TimeUnit;

/**
 * Created by Ujjwal on 1/23/2017.
 */
public class BaseTest {

     protected static WebDriver driver;
     protected WebDriverWait wait;

    @Before
    public void setup(){
        System.setProperty("webdriver.firefox.marionette","C:\\Leapfrog\\geckodriver.exe");
        driver=new FirefoxDriver();
        wait= new WebDriverWait(driver, 120);
        driver.manage().window().maximize();
        driver.get("http://localhost/wordpress/wp-admin");
    }

    @After
    public void teardown(){
driver.quit();
    }
}
