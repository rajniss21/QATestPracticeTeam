package tests.user;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pageobjects.dashboard.Dashboard;
import pageobjects.user.AddNewUser;
import tests.BaseTest;


/**
 * Created by RajniSh on 1/24/2017.
 */
public class UserTest extends BaseTest {
    @Test
    public void testThatAddNewUserWorks(){
        login.setUsername("admin");
        login.setPassword("admin");
        login.setLogin();

        Dashboard dashboard=new Dashboard(driver);
        PageFactory.initElements(driver,dashboard);
        dashboard.gotoUsers();
        dashboard.gotoAddNewUser();


        AddNewUser addNewUser=new AddNewUser(driver);
        PageFactory.initElements(driver,addNewUser);
        addNewUser.setUsername("Rajnish");
        addNewUser.setEmail("pradhanrajnishbltr21@outlook.com");
        addNewUser.setFirstname("Rajnish");
        addNewUser.setlastname("Pradhan");
        addNewUser.setwebsite("www.rajnish.com.np");
        addNewUser.setPassclick();
        addNewUser.setPassword("admin123");
        //addNewUser.setSendusernotification();
        addNewUser.setRole("Administrator");
        addNewUser.setSubmitbutton();



    }

   /* @Test
    public void validateThatAddNewUserPageOpensWhileWeClickUsersLink() {


    }*/
}
