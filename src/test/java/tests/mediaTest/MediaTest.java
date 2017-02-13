package tests.mediaTest;

import org.junit.Before;
import org.junit.Test;
import pageobjects.dashboard.Dashboard;
import pageobjects.media.MediaLibrary;
import tests.BaseTestLogin;

/**
 * Created by Ujjwal on 2/13/2017.
 */
public class MediaTest extends BaseTestLogin {
    @Before
    public void setup(){
        super.setup();
        MediaLibrary mediaLibrary=new MediaLibrary(driver);
    }
    @Test
    public void testThatMediaisDeleted(){
        Dashboard dashboard=new Dashboard(driver);
        dashboard.gotoMediaLibrary();
        

        MediaLibrary mediaLibrary=new MediaLibrary(driver);
        mediaLibrary.clickCheckBox();
    }
}
