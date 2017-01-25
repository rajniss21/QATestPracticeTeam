package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.Login;

import java.sql.Driver;

/**
 * Created by superuser on 1/22/2017.
 */
public class DashboardTest extends BaseTest {
    @Test
    public void testThatDashboardLinkWorks(){

        login.setUsername("admin");
        login.setPassword("admin");
        login.setLogin();

        pageobjects.Dashboard dashboard = new pageobjects.Dashboard(driver);
        PageFactory.initElements(driver,dashboard);
        dashboard.gotohomeLink();


    }

}
