package VivekTechnologies.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;
    public static Properties config = new Properties();
    public static Properties OR = new Properties();
    public static FileInputStream fis;

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
    public void setup() throws FileNotFoundException {

        if(driver==null){

            FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\Config.properties");
            try {
                config.load(fis);
            } catch (IOException e) {
                e.printStackTrace();
            }
            fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\OR.properties");
            try {
                OR.load(fis);
            } catch (IOException e) {
                e.printStackTrace();
            }

            if(config.getProperty("browser").equals("chrome")){
                System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");
                driver =new ChromeDriver();
            }

            driver.get(config.getProperty("testsiteurl"));
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Long.parseLong(config.getProperty("implicitwait")), TimeUnit.SECONDS);

        }

    }
    @AfterSuite
    public void teardown(){
        if(driver!=null){
        driver.quit();
    }

    }

}
