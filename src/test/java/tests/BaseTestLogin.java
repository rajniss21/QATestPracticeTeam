package tests;

import org.junit.Before;
import pageobjects.login.Login;

/**
 * Created by RajniSh on 2/12/2017.
 */
public class BaseTestLogin extends BaseTest{
    protected Login login;

    @Before
    public void setup(){
        super.setup();
        new Login(driver).doLogin("admin","admin");
    }
}
