package VivekTechnologies.testcases;

import VivekTechnologies.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;

public class Login extends TestBase {


    @Test(groups = {"kiana"})
    public void test1() {
    driver.findElement(By.cssSelector(OR.getProperty("signin"))).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
