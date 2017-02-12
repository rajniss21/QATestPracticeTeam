package tests.loginTest;

import org.apache.bcel.generic.NEW;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pageobjects.dashboard.Dashboard;
import pageobjects.login.Login;
import tests.BaseTest;


/**
 * Created by Ujjwal on 1/18/2017.
 */
public class LoginTest extends BaseTest {
   private Login login;

    @Before
    public void setup(){
        super.setup();
        login=new Login(driver);
    }
    @Test
    public void testThatLoginWorksWithCorrectUsernameAndPassword(){
        login.doLogin("admin","admin");
    }
}
