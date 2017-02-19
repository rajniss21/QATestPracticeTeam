package tests.postTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.dashboard.Dashboard;
import pageobjects.posts.Posts;
import tests.BaseTestLogin;

/**
 * Created by Ujjwal on 2/13/2017.
 */
public class PostTest extends BaseTestLogin {
    @Test
    public void testThatAddNewpostWorks(){
        Dashboard dashboard=new Dashboard(driver);
        PageFactory.initElements(driver,dashboard);
        dashboard.gotoAddNewPost();

        Posts posts=new Posts(driver);
        posts.dotitle("title");
        posts.paragraph("paragaraph ajhsdy jhadh a sjffiscdfsflshf");
        posts.dopublish();
    }

    

}
