package pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

/**
 * Created by RajniSh on 2/22/2017.
 */
public class UploadFileViaPrompt{

    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.firefox.marionette","C:\\Leapfrog\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://localhost/wordpress/wp-admin/");
        driver.findElement(By.id("user_login")).sendKeys("admin");
        driver.findElement(By.id("user_pass")).sendKeys("admin");
        driver.findElement(By.id("wp-submit")).click();
        driver.findElement(By.xpath(".//*[@id='menu-pages']/a/div[3]")).click();
        driver.findElement(By.xpath(".//*[@id='menu-pages']/ul/li[3]/a")).click();
        driver.findElement(By.id("title")).sendKeys("this is QA");
        driver.findElement(By.id("insert-media-button")).click();
        driver.findElement(By.id("__wp-uploader-id-1")).sendKeys("C:\\Users\\RajniSh\\Desktop\\goth.txt");
        Thread.sleep(5000);

        //driver.findElement(By.id()"C:\\Users\\RajniSh\\Desktop\\1-istqb_foundation_level_syllabus_2011.pdf");
       //Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);







    }
}
