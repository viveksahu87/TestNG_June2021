package VivekTechnologies.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
    public static WebDriver driver;
    /*
    *initialising
    *WebDriver
    * Properties
    * Logs
    * ExtentReports
    * DB
    * Excel
    * Mail
    * */

    @BeforeSuite
    public void setup(){

    }
    @AfterSuite
    public void teardown(){

    }

}
