package tests.user;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pageobjects.dashboard.Dashboard;
import pageobjects.user.AddNewUser;
import tests.BaseTest;

public class UserTest extends BaseTest{
        @Test
public void TestThatAddNewUserWorks(){
        login.setUsername("admin");
            login.setPassword("admin");
            login.setLogin();

            Dashboard dashboard=new Dashboard(driver);
            PageFactory.initElements(driver,dashboard);

            AddNewUser addNewUser=new AddNewUser(driver);
            addNewUser.setUsername("Rajnish" );
            addNewUser.setEmail("pradhanrajnishbltr21@outlook.com");
            addNewUser.setFirstname("Rajnish");
            addNewUser.setlastname("Pradhan");
            addNewUser.setwebsite("www.rajnish.com.np");
            addNewUser.setPassclick();
            addNewUser.setPassword("admin123");
            addNewUser.setSendusernotification();
            addNewUser.setRole("Adminstrator");
            addNewUser.setSubmitbutton();
        }


        }
