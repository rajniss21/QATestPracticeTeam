package tests.pagesTest;

import org.junit.After;
import org.junit.Test;
import pageobjects.dashboard.Dashboard;
import pageobjects.pages.AddNewPage;
import pageobjects.pages.DeletePage;
import tests.BaseTestLogin;

/**
 * Created by RajniSh on 2/12/2017.
 */
public class PagesTest extends BaseTestLogin {
    @Test
    public void testThatAddNewPageWorks(){
        Dashboard dashboard=new Dashboard(driver);
        dashboard.gotoAddNewPageLink();

        AddNewPage addNewPage=new AddNewPage(driver);
        addNewPage.doAddTitle("software qa meetup");
        addNewPage.addParagraph("My name is Rajnish Pradhan.I live in New Baneshwor, Ktahmandu, Nepal My home town is Udayapur Beltar");
        addNewPage.clickPublishButton();
    }
    @Test
    public void testThatAllPageWorks(){
        Dashboard dashboard=new Dashboard(driver);
        dashboard.gotoAllPage();

        DeletePage deletePage=new DeletePage(driver);
        deletePage.clickOnCheckbox();
        deletePage.clickOnChooseAction("Move to Trash");
        deletePage.clickOnApply();



    }
    @After
    public void teardown(){

    }
}
