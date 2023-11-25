import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import java.time.Duration;


public class BaseTest {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

    @BeforeSuite
    public void setup(){
        WebDriverManager.chromedriver().setup();
    }
    @BeforeMethod
    @Parameters({"baseURL"})
    public void launchBrowser(){
        ChromeOptions options = new ChromeOptions();
        //Added ChromeOptions argument below to fix websocket error
        //options.addArguments("--remote-allow-origins");
        options.addArguments("--remote-allow-origins=*", "--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        navigateToLoginPage();
    }
    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }

    public void navigateToLoginPage(){
        driver.get(url);
    }

    public void provideEmail(String email){
        WebElement emailField = driver.findElement(By.xpath("//input[@name='username']"));
        emailField.clear();
        emailField.sendKeys(email);
    }
    public void providePassword(String password){
        WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));
        passwordField.clear();
        passwordField.sendKeys(password);
    }
    public void clickSubmitBtn(){
        WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
        submit.click();
    }
}
