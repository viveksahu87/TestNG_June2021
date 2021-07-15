package VivekTechnologies.base;

import VivekTechnologies.utilities.ExcelReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    public static WebDriverWait wait;
    public static Logger log = LoggerFactory.getLogger(TestBase.class);
   // public static ExcelReader excel = new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\resources\\excel\\testdata.xlsx");
    /*
    *initialising
    *WebDriver
    * Properties
    * Logs
    * Extent Reports
    * DB
    * Excel
    * Mail
    * */


    @BeforeSuite
    public void setup() throws FileNotFoundException {
      //  log.info("setupmethod");
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
         //   log.info("window is open45");

            driver.manage().window().maximize();
          //  log.info("window is maximised");
            driver.manage().timeouts().implicitlyWait(Long.parseLong(config.getProperty("implicitwait")), TimeUnit.SECONDS);
            wait = new WebDriverWait(driver,5);
        }

    }
    @AfterSuite
    public void teardown(){
        if(driver!=null){
            log.info("Quitting driver");
        driver.quit();
    }

   }

}
