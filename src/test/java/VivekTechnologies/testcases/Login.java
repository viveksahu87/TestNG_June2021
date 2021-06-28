package VivekTechnologies.testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;

public class Login {

    public static WebDriver driver;

    // before

    @BeforeMethod
    public void launchDriver() {
        System.setProperty("webdriver.chrome.driver",
                "E:\\Selenium_assignments\\Selium jars\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    // test 1
    @Test(groups = {"kiana"})
    public void test1() {
        driver.get("http://selfregistration.cowin.gov.in/");
        System.out.println("TEST CASE : 1 " + driver.getTitle());

    }

    // test 2
    @Test(groups = {"kiana"})
    public void test2() {
        driver.navigate().to("https://www.facebook.com/");
        System.out.println("TEST CASE : 2 " + driver.getTitle());
    }

    @Test(groups = {"kiana"})

    // test 3
    public void test3() {
        driver.navigate().to("http://amazon.com/");
        System.out.println("TEST CASE : 3 " + driver.getTitle());
    }

    @AfterMethod
    public void quit() {
        driver.quit();
    }



}
