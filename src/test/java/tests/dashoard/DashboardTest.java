package tests.dashoard;

import org.junit.Assert;
import org.junit.Test;
import pageobjects.dashboard.Dashboard;
import tests.BaseTest;


/**
 * Created by superuser on 1/22/2017.
 */
public class DashboardTest extends BaseTest {
    @Test
    public void testThatDashboardLinkWorks(){

        login.setUsername("admin");
        login.setPassword("admin");
        login.setLogin();

        Dashboard dashboard=new Dashboard(driver);
        String heading =dashboard.getSomeText();
        dashboard.gotohomeLink();
        Assert.assertEquals("Dashboard",heading);

    }

}
