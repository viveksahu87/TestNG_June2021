package VivekTechnologies.testcases;

import VivekTechnologies.base.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login extends TestBase {


    @Test(groups = {"kiana"})
    public void test1() {
    driver.findElement(By.cssSelector(OR.getProperty("bmlBtn_CSS"))).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
