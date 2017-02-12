package tests.dashboardTest;

import org.junit.Before;
import org.junit.Test;
import pageobjects.dashboard.Dashboard;
import tests.BaseTestLogin;

/**
 * Created by RajniSh on 2/12/2017.
 */
public class DashboardTest extends BaseTestLogin{
    private Dashboard dashboard;
    @Before
    public void setup(){
        super.setup();
        dashboard=new Dashboard(driver);
    }
    @Test
    public void testThatDashboardLinkWorks(){
        dashboard.gotoDashboardLink();
    }
    @Test
    public void testThatHomeLinkWorks(){
        dashboard.gotoHomeLink();
    }
    @Test
    public void testThatVisitSiteLinkWorks(){
        dashboard.gotoVisitSiteLink();
    }

}
