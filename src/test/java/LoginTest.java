import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void loginValidEmailPassword(){

        provideEmail("Admin");
        providePassword("admin123");
        clickSubmitBtn();

    }
}
