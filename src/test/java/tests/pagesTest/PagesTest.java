package tests.pagesTest;

import org.junit.Test;
import pageobjects.dashboard.Dashboard;
import pageobjects.pages.AddNewPage;
import tests.BaseTestLogin;

/**
 * Created by RajniSh on 2/12/2017.
 */
public class PagesTest extends BaseTestLogin {
    @Test
    public void testThatAddNewPageWorks(){
        Dashboard dashboard=new Dashboard(driver);
        dashboard.gotoPagesLink();
        dashboard.gotoAddNewPageLink();

        AddNewPage addNewPage=new AddNewPage(driver);
        addNewPage.doAddTitle("software qa meetup");
        addNewPage.addParagraph("how qa fails");
        addNewPage.clickPublishButton();
    }
}
